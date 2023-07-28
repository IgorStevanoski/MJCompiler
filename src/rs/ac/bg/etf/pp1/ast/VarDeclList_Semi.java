// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class VarDeclList_Semi extends VarDeclListSemi {

    private VarDeclListSemi varDeclListSemi;
    private VarDeclList varDeclList;

    public VarDeclList_Semi (VarDeclListSemi varDeclListSemi, VarDeclList varDeclList) {
        this.varDeclListSemi=varDeclListSemi;
        if(varDeclListSemi!=null) varDeclListSemi.setParent(this);
        this.varDeclList=varDeclList;
        if(varDeclList!=null) varDeclList.setParent(this);
    }

    public VarDeclListSemi getVarDeclListSemi() {
        return varDeclListSemi;
    }

    public void setVarDeclListSemi(VarDeclListSemi varDeclListSemi) {
        this.varDeclListSemi=varDeclListSemi;
    }

    public VarDeclList getVarDeclList() {
        return varDeclList;
    }

    public void setVarDeclList(VarDeclList varDeclList) {
        this.varDeclList=varDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(varDeclListSemi!=null) varDeclListSemi.accept(visitor);
        if(varDeclList!=null) varDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(varDeclListSemi!=null) varDeclListSemi.traverseTopDown(visitor);
        if(varDeclList!=null) varDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(varDeclListSemi!=null) varDeclListSemi.traverseBottomUp(visitor);
        if(varDeclList!=null) varDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclList_Semi(\n");

        if(varDeclListSemi!=null)
            buffer.append(varDeclListSemi.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(varDeclList!=null)
            buffer.append(varDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclList_Semi]");
        return buffer.toString();
    }
}
