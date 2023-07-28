// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ClassBothItems extends ClassDeclItemList {

    private VarDeclListSemi varDeclListSemi;
    private ConstrMethDecl constrMethDecl;

    public ClassBothItems (VarDeclListSemi varDeclListSemi, ConstrMethDecl constrMethDecl) {
        this.varDeclListSemi=varDeclListSemi;
        if(varDeclListSemi!=null) varDeclListSemi.setParent(this);
        this.constrMethDecl=constrMethDecl;
        if(constrMethDecl!=null) constrMethDecl.setParent(this);
    }

    public VarDeclListSemi getVarDeclListSemi() {
        return varDeclListSemi;
    }

    public void setVarDeclListSemi(VarDeclListSemi varDeclListSemi) {
        this.varDeclListSemi=varDeclListSemi;
    }

    public ConstrMethDecl getConstrMethDecl() {
        return constrMethDecl;
    }

    public void setConstrMethDecl(ConstrMethDecl constrMethDecl) {
        this.constrMethDecl=constrMethDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(varDeclListSemi!=null) varDeclListSemi.accept(visitor);
        if(constrMethDecl!=null) constrMethDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(varDeclListSemi!=null) varDeclListSemi.traverseTopDown(visitor);
        if(constrMethDecl!=null) constrMethDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(varDeclListSemi!=null) varDeclListSemi.traverseBottomUp(visitor);
        if(constrMethDecl!=null) constrMethDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassBothItems(\n");

        if(varDeclListSemi!=null)
            buffer.append(varDeclListSemi.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(constrMethDecl!=null)
            buffer.append(constrMethDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassBothItems]");
        return buffer.toString();
    }
}
