import java.util.ArrayList;
import java.util.List;

public class Gen extends LangBaseListener {
	public List<String> decls = new ArrayList<>();

	//write code here, HINT: override the listerner function (you know the one that enters declarations)
	// and copy the code from the instructions
	@Override public void enterDecl(LangParser.DeclContext ctx) {
		String typename = ctx.typename().getText();
		String varname = ctx.ID().getText();
		if (isClassName(typename)) {
			System.out.println(typename + " *" + varname + ";");
		} else {
			System.out.println(typename + " " + varname + ";");
		}
	}
	/** Pretend we have type information */
	public boolean isClassName(String typename) {
		return Character.isUpperCase(typename.charAt(0));
	}
}
