import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import riki.cobra.CustomCobraVisitor;
import riki.cobra.language.CobraLexer;
import riki.cobra.language.CobraParser;

public class Test {

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("Test.txt");
		ANTLRInputStream input = new ANTLRInputStream(fs);
		CobraLexer lexer = new CobraLexer(input);
		CommonTokenStream ts = new CommonTokenStream(lexer);
		
		CobraParser parser = new CobraParser(ts);
		ParseTree tree = parser.cobra();
		
		CustomCobraVisitor visitor = new CustomCobraVisitor();
		visitor.visit(tree);
		
		visitor.elaborate();
	}
}
