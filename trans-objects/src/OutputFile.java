import java.util.ArrayList;
import java.util.List;

public class OutputFile extends OutputModelObject {
	public List<OutputModelObject> decls = new ArrayList<>();

	public void addDecl(OutputModelObject decl) { decls.add(decl); }

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		for (OutputModelObject decl : decls) {
			buf.append(decl+"\n");
		}
		return buf.toString();
	}
}