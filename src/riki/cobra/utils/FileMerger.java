package riki.cobra.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.tools.ant.DirectoryScanner;

import riki.cobra.Cobra;

public class FileMerger {
	public static String MIME = "text";
	// Select only text type file
	public static boolean MIME_FILTER_ENABLED = true;
	
	public static List<String> findAllFiles(Set<String> folders, Collection<String> files, Collection<String> filesToExclude){
		List<String> result = new LinkedList<>();
		DirectoryScanner scanner = new DirectoryScanner();
		scanner.setIncludes(files.toArray(new String[] {}));
		scanner.setCaseSensitive(Cobra.CASESENSITIVE);
		String[] toExcludes = filesToExclude.toArray(new String[filesToExclude.size()]);
		scanner.setExcludes(toExcludes);
		folders.forEach(folder -> {			
			scanner.setBasedir(folder);				
			scanner.scan();	
			for(String f : scanner.getIncludedFiles())
			{
				Path p = Paths.get(folder, f);
				try {
					if(MIME_FILTER_ENABLED && Files.probeContentType(p).contains(MIME)) {
						result.add(p.toAbsolutePath().toString());
					}						
					if(!MIME_FILTER_ENABLED){
						result.add(p.toAbsolutePath().toString());
					}
				} catch (IOException e) {
					System.err.println(p.toAbsolutePath().toString() + ": " + e.getMessage());
				}
			}
		});
		return result;
	}
	
	public static Set<String> findAllSubFolders(String base, Collection<String> excludes){
		Set<String> result = new HashSet<>();
		File[] flist = new File(base).listFiles();
		for(File file : flist) {
			if(file.isDirectory())
				try {
					String cpath = file.getCanonicalPath().toString();
					boolean skip = false;
					if(excludes != null)
						for(String exc : excludes) {
							if(cpath.matches(exc)) {
								skip = true;
								break;
							}
						}
					if(!skip) {
						result.add(cpath);
						result.addAll(findAllSubFolders(cpath, excludes));
					}					
				} catch (IOException e) {	
					System.err.println(e.getMessage());
				}			
		}
		return result;
	}
}
