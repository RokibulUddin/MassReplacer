package riki.cobra.executor.replace;

import java.util.ArrayList;
import java.util.List;

public class ReplaceInfo {
	private List<String> toReplace;
	private String replaceWith;
	
	public ReplaceInfo(List<String> toReplace, String replaceWith) {
		this.toReplace = toReplace;
		this.replaceWith = replaceWith;
	}
	
	public ReplaceInfo(String toReplace, String replaceWith) {
		this.toReplace = new ArrayList<>(1);
		this.toReplace.add(toReplace);
		this.replaceWith = replaceWith;
	}

	public ReplaceInfo() {		
	}

	public List<String> getToReplace() {
		return toReplace;
	}

	public void setToReplace(List<String> toReplace) {
		this.toReplace = toReplace;
	}

	public String getReplaceWith() {
		return replaceWith;
	}

	public void setReplaceWith(String replaceWith) {
		this.replaceWith = replaceWith;
	}
	
}
