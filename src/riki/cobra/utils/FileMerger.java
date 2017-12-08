package riki.cobra.utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.tools.ant.DirectoryScanner;

import riki.cobra.Cobra;

public class FileMerger {
	public static List<String> findAllFiles(List<String> folders, List<String> files){
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
}
