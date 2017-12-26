package riki.cobra.cmd;

import java.util.List;

import riki.cobra.Cobra;

public class ExitCmd implements CobraCmd {

	@Override
	public void process() {		
	}

	// exit when command is found, not after
	@Override
	public void addToCmd(List<CobraCmd> stack) {
		// process all cmd before
		Cobra.getInstance().process();
		System.out.println("Exiting after EXIT command.");
		System.exit(0);
	}
}
