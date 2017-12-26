package riki.cobra.executor.replace;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.PatternSyntaxException;

import jregex.Pattern;

public class SimpleTextReplacer extends Replacer {
	private Charset charset = StandardCharsets.UTF_8;

	public SimpleTextReplacer(String path) {
		super(path);		
	}

	@Override
	public void replace(List<ReplaceInfo> infos) {		
		try {			
			System.out.println("Elaborating file " + filePath);	
			Path path = Paths.get(this.filePath);
			String content = new String(Files.readAllBytes(path), charset);
			boolean changed = false;
			int hash = content.hashCode();
			for(ReplaceInfo ri : infos) {
				for(String replace : ri.getToReplace()) {					
					try {
						Pattern p = new Pattern(replace);
						jregex.Replacer r = p.replacer(ri.getReplaceWith());
						content = r.replace(content);
						if(content.hashCode() != hash) {
							hash = content.hashCode();
							changed = true;
							System.out.println("Replaced " + replace + " with " + ri.getReplaceWith() + " on file " + filePath);
						}
					}catch (PatternSyntaxException e) {
						System.err.println("Regex not valid: " + replace);
					}
				}
			}
			if(changed)
				Files.write(path, content.getBytes(charset));
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
