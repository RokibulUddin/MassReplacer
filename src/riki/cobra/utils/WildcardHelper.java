package riki.cobra.utils;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.DirectoryScanner;

import riki.cobra.Cobra;

public class WildcardHelper 
{
	/**
	 * Prende una stringa tipo "path\*\path2"
	 * @param p
	 * @return retituisce cartelle esistenti tipo "path\ciao\path2", "path\ciao2\path2"
	 */
	public static List<String> solveFolder(String p)
	{		
		List<String> result;
		String[] splitted = p.split("\\*");
		
		if(splitted[0].isEmpty()) {
			System.err.println("* char cannot be as first element! Skipping folder " + p);
			return null;
		}		
		
		DirectoryScanner scanner = new DirectoryScanner();
		scanner.setBasedir(splitted[0]);
		scanner.setCaseSensitive(Cobra.CASESENSITIVE);
		scanner.setIncludes(new String[] {"**" + splitted[1]});
		scanner.scan();
		String[] dirs = scanner.getIncludedDirectories();
		result = new ArrayList<>(dirs.length);
		for(String s : dirs) {
			result.add(Paths.get(splitted[0], s).toString());
		}
		return result;
	}
}
