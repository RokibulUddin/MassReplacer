package riki.cobra.cmd;

import java.util.List;

public interface CobraCmd {
	public void process();
	default public void addToCmd(List<CobraCmd> stack) {
		stack.add(this);
	}
}
