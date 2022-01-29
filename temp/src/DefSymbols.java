import symtab.*;
public class DefSymbols extends LaLaBaseListener {
	protected BasicScope globals;
	protected BasicScope currentScope = null;

	@Override
	public void enterProg(LaLaParser.ProgContext ctx) {
		globals = new BasicScope();
		currentScope = globals;
	}

	@Override
	public void exitProg(LaLaParser.ProgContext ctx) {
		currentScope.getEnclosingScope();
	}

	@Override
	public void enterVar(LaLaParser.VarContext ctx) {
		String varName = ctx.ID().getText();
		VariableSymbol sym = new VariableSymbol(varName);
		currentScope.define(sym);
	}

	@Override
	public void enterStat(LaLaParser.StatContext ctx) {
		String varName = ctx.ID().getText();
		Symbol sym = currentScope.resolve(varName); // resolve in the current scope
		if ( sym==null ) {
			System.err.println("No such var: "+varName);
		}
	}

	@Override
	public void enterExpr(LaLaParser.ExprContext ctx) {
		if ( ctx.ID()!=null ) {
			String varName = ctx.ID().getText();
			Symbol sym = currentScope.resolve(varName); // resolve varName in the current scope
			if ( sym==null ) {
				System.err.println("No such var: "+varName);
			}
		}
	}
}