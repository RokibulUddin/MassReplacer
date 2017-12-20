package riki.cobra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import riki.cobra.language.CobraLexer;
import riki.cobra.language.CobraParser;
import riki.cobra.utils.FileMerger;

public class App {

	public static void main(String[] args) throws IOException {		
		String file = createOptions(args);
		if(file == null) {
			System.exit(1);
		}
		FileInputStream fs = new FileInputStream(file);
		ANTLRInputStream input = new ANTLRInputStream(fs);
		CobraLexer lexer = new CobraLexer(input);
		CommonTokenStream ts = new CommonTokenStream(lexer);
		
		CobraParser parser = new CobraParser(ts);
		ParseTree tree = parser.cobra();
		
		CustomCobraVisitor visitor = new CustomCobraVisitor();
		visitor.visit(tree);
		
		visitor.elaborate();

	}
	
	private static String createOptions(String[] args) {
		CommandLineParser parser = new DefaultParser();
		
		Options options = new Options();
		options.addOption("h", "help", false, "show this help message");
		options.addOption("dm", "disable-mime", false, "dont exclude non text type file");		
		options.addOption(Option.builder().longOpt("mime-type")
					.hasArg().argName("MIME-TYPE")
					.desc("mime type (filter by this mime type)").build());
		
		try {
			CommandLine line = parser.parse(options, args);			
			if(line.hasOption("dm")) {
				FileMerger.MIME_FILTER_ENABLED = false;
			}
			
			if(line.hasOption("mime-type")) {
				FileMerger.MIME = line.getOptionValue("mime-type");
			}
			
			List<String> ar = line.getArgList();
			if(ar.isEmpty() || (ar.size() != 1)) {
				help(options);
				System.exit(1);
			}
			return ar.get(0);	
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	private static void help(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("cobra <script>", options);
	}

}
