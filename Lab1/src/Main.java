import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import java.io.IOException;
public class Main {
    public static void main(String[] args){
        try{
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            gLexer lexer= new gLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            gParser parser = new gParser(token);
            ParseTree tree = parser.prule();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
        }

        catch (IOException e){
            e.printStackTrace();

        }

    }
}
