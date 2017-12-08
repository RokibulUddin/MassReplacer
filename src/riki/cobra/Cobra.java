package riki.cobra;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import riki.cobra.utils.FileMerger;
import riki.cobra.utils.WildcardHelper;

public class Cobra {
	public static boolean CASESENSITIVE = false;
	private static final String WILDCARD = "*";
	private List<String> folders;
	private List<String> files;

	public Cobra() {
		folders = new LinkedList<>();
		files = new LinkedList<>();
	}

	public void addFolder(String f) {
		try 
		{
			if(f.contains(WILDCARD))
			{
				folders.addAll(WildcardHelper.solveFolder(f));
			}else
			{
				if(Files.exists(Paths.get(f), LinkOption.NOFOLLOW_LINKS))
					folders.add(f);
				else {
					System.err.println("Folder " + f + " cannot be found! Skipping...");
				}
			}
		}
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage() +". Skipping folder " + f);
		}
	}

	public void addFile(String f) {
		files.add(f);
	}

	public void printFileAndFolders() {
		System.out.println("Folders:");
		folders.forEach(f -> System.out.println("\t"+f));
		System.out.println("Files:");
		files.forEach(f -> System.out.println("\t"+f));
		
		System.out.println("Result:");
		FileMerger.findAllFiles(folders, files).forEach(f -> System.out.println("\t" + f));
	}

}
