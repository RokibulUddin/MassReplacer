package riki.cobra.executor.replace;

import java.util.List;

public abstract class Replacer {
	protected String filePath;
	
	public Replacer(String path) {
		this.filePath = path;
		if(path == null) {
			throw new RuntimeException("File path cannot be null");
		}
	}
	
	public abstract void replace(final List<ReplaceInfo> infos);
}
