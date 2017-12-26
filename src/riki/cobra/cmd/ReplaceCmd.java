package riki.cobra.cmd;

import java.util.ArrayList;
import java.util.List;

import riki.cobra.Cobra;
import riki.cobra.executor.replace.ReplaceExecutor;
import riki.cobra.executor.replace.ReplaceInfo;
import riki.cobra.executor.replace.SimpleTextReplacer;

public class ReplaceCmd implements CobraCmd {
	private ReplaceInfo rinfo;
	
	public ReplaceCmd(List<String> replace, String with) {
		rinfo = new ReplaceInfo(replace, with);
	}

	public ReplaceCmd(ReplaceInfo info) {
		rinfo = info;
	}

	@Override
	public void process() {		
	}

	@Override
	public void addToCmd(List<CobraCmd> stack) {
		// Change the same ReplaceExecCmd adding one new rinfo
		for(CobraCmd cmd : stack){
			if(cmd instanceof ReplaceExecCmd){
				ReplaceExecCmd rcmd = (ReplaceExecCmd)cmd;
				rcmd.addReplaceInfo(rinfo);
				return;
			}
		}
		// Add new ReplaceExecCmd if doesn't exist
		ReplaceExecCmd cmd = new ReplaceExecCmd();
		cmd.addReplaceInfo(rinfo);
		cmd.addToCmd(stack);
	}
	
	public class ReplaceExecCmd implements CobraCmd {

		private List<ReplaceInfo> replaceInst;
		
		public ReplaceExecCmd() {
			replaceInst = new ArrayList<>();
		}
		
		public void addReplaceInfo(ReplaceInfo rinfo){
			replaceInst.add(rinfo);
		}
		
		@Override
		public void process() {
			if(!replaceInst.isEmpty()) {
				ReplaceExecutor rexec = new ReplaceExecutor(replaceInst);
				Cobra.getInstance().getFilesPath().forEach(f -> rexec.replace(new SimpleTextReplacer(f)));
				rexec.shutdown();
			}
		}
	}
}
