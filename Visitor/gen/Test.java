import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Properties;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Test{
    public static void main(String[] args){
        String e = "1+2*3";
        CodePointCharStream input = fromString(e);

        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.s();
        System.out.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);

        ExprEval visitor = new ExprEval();
        int v = visitor.visit(tree);
        System.out.println(v);

    }
}