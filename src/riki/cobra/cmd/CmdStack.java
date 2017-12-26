package riki.cobra.cmd;

import java.util.LinkedList;
import java.util.List;

public class CmdStack {
	private List<CobraCmd> stack;
	
	public CmdStack() {
		this.stack = new LinkedList<>();
	}
	
	public void addCmd(CobraCmd cmd){
		cmd.addToCmd(stack);
	}
	
	public void process(){
		stack.forEach(cmd -> cmd.process());
	}

}
