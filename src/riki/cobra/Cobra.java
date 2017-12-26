package riki.cobra;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import riki.cobra.cmd.CmdStack;
import riki.cobra.utils.FileMerger;
import riki.cobra.utils.WildcardHelper;

public class Cobra {
	public static boolean CASESENSITIVE = false;
	private static final String WILDCARD = "*";
	private Set<String> folders;
	private List<String> files;
	private Set<String> filesRuleToExclude;
	private List<String> filesPath;
	private CmdStack stack;
	private static Cobra instance = new Cobra();

	private Cobra() {
		folders = new HashSet<>();
		files = new LinkedList<>();
		filesRuleToExclude = new HashSet<>();
		stack = new CmdStack();
	}
	
	public static Cobra getInstance(){
		return instance;
	}

	public Set<String> addFolder(String f) {
		Set<String> result = new HashSet<>();
		try 
		{
			if(f.contains(WILDCARD))
			{
				result = WildcardHelper.solveFolder(f);				
			}else
			{
				if(Files.exists(Paths.get(f), LinkOption.NOFOLLOW_LINKS))
					result.add(f);
				else {
					System.err.println("Folder " + f + " cannot be found! Skipping...");
				}
			}
		}
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage() +". Skipping folder " + f);
		}
		folders.addAll(result);
		return result;
	}

	public void addFile(String f) {
		files.add(f);
	}

	public void addFile(Collection<String> files) {
		files.addAll(files);
	}

	public void addFilesRuleToExclude(Set<String> filesRuleToExclude) {
		if(filesRuleToExclude != null)
			this.filesRuleToExclude.addAll(filesRuleToExclude);
	}

	public void process() {
		System.out.println("Folders:");
		folders.forEach(f -> System.out.println("\t"+f));
		System.out.println("Files:");
		files.forEach(f -> System.out.println("\t"+f));

		System.out.println("Result:");
		filesPath = FileMerger.findAllFiles(folders, files, filesRuleToExclude);
		filesPath.forEach(f -> System.out.println("\t" + f));

		stack.process();
	}
	
	public CmdStack getStack(){
		return this.stack;
	}
	
	public final List<String> getFilesPath(){
		return filesPath;
	}

	public void addSubFolders(String path, Collection<String> excludes) {
		folders.addAll(FileMerger.findAllSubFolders(path, excludes));
	}

}
