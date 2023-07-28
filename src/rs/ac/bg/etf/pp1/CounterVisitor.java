package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.*;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;


// za brojanje argumenata f-ja pri pozivanju enter naredbe
public class CounterVisitor extends VisitorAdaptor {
	
	protected int count;
	
	public int getCount() {
		return count;
	}
	
	public static class FormParamCounter extends CounterVisitor {

		@Override
		public void visit(FormalParameter formParamDecl1) {
			count++;
		}		
	}
	
	public static class VarCounter extends CounterVisitor {		
		@Override
		public void visit(VarDecl_noBracket VarDecl) {
			count++;
		}
		
		@Override
		public void visit(VarDecl_Bracket VarDecl) {
			count++;
		}
	}
}
