// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Addop_Terms extends AddopTerm {

    private AddopTerm addopTerm;
    private Addop addop;
    private Term term;

    public Addop_Terms (AddopTerm addopTerm, Addop addop, Term term) {
        this.addopTerm=addopTerm;
        if(addopTerm!=null) addopTerm.setParent(this);
        this.addop=addop;
        if(addop!=null) addop.setParent(this);
        this.term=term;
        if(term!=null) term.setParent(this);
    }

    public AddopTerm getAddopTerm() {
        return addopTerm;
    }

    public void setAddopTerm(AddopTerm addopTerm) {
        this.addopTerm=addopTerm;
    }

    public Addop getAddop() {
        return addop;
    }

    public void setAddop(Addop addop) {
        this.addop=addop;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term=term;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(addopTerm!=null) addopTerm.accept(visitor);
        if(addop!=null) addop.accept(visitor);
        if(term!=null) term.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(addopTerm!=null) addopTerm.traverseTopDown(visitor);
        if(addop!=null) addop.traverseTopDown(visitor);
        if(term!=null) term.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(addopTerm!=null) addopTerm.traverseBottomUp(visitor);
        if(addop!=null) addop.traverseBottomUp(visitor);
        if(term!=null) term.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Addop_Terms(\n");

        if(addopTerm!=null)
            buffer.append(addopTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(addop!=null)
            buffer.append(addop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(term!=null)
            buffer.append(term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Addop_Terms]");
        return buffer.toString();
    }
}
