package riki.cobra.utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.tools.ant.DirectoryScanner;

import riki.cobra.Cobra;

public class FileMerger {
	public static List<String> findAllFiles(Set<String> folders, List<String> files){
		List<String> result = new LinkedList<>();
		DirectoryScanner scanner = new DirectoryScanner();
		scanner.setIncludes(files.toArray(new String[] {}));
		folders.forEach(folder -> {			
			scanner.setBasedir(folder);
			scanner.setCaseSensitive(Cobra.CASESENSITIVE);
			scanner.scan();			
			result.addAll(Arrays.asList(scanner.getIncludedFiles()));
		});
		return result;
	}
	
	public static Set<String> findAllSubFolders(String base){
		Set<String> result = new HashSet<>();
		File[] flist = new File(base).listFiles();
		for(File file : flist) {
			if(file.isDirectory())
				try {
					result.add(file.getCanonicalPath().toString());
					result.addAll(findAllSubFolders(file.getCanonicalPath().toString()));
				} catch (IOException e) {	
					System.err.println(e.getMessage());
				}			
		}
		return result;
	}
}
