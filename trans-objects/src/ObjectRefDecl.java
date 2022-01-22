
public class ObjectRefDecl extends OutputModelObject {
	public String type;
	public String id;

	// Construct an ObjectRefDecl function
	public ObjectRefDecl(String type, String id) {
		this.type = type;
		this.id = id;
	}

	// override toStrig()here
	@Override
	public String toString() {
		return type+" *"+id+";";
	}
}

