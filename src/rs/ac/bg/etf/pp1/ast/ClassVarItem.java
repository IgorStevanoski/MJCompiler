// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ClassVarItem extends ClassDeclItemList {

    private VarDeclListSemi varDeclListSemi;

    public ClassVarItem (VarDeclListSemi varDeclListSemi) {
        this.varDeclListSemi=varDeclListSemi;
        if(varDeclListSemi!=null) varDeclListSemi.setParent(this);
    }

    public VarDeclListSemi getVarDeclListSemi() {
        return varDeclListSemi;
    }

    public void setVarDeclListSemi(VarDeclListSemi varDeclListSemi) {
        this.varDeclListSemi=varDeclListSemi;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(varDeclListSemi!=null) varDeclListSemi.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(varDeclListSemi!=null) varDeclListSemi.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(varDeclListSemi!=null) varDeclListSemi.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassVarItem(\n");

        if(varDeclListSemi!=null)
            buffer.append(varDeclListSemi.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassVarItem]");
        return buffer.toString();
    }
}
