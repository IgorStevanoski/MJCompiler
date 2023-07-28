// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ConstrMeth_Decl extends ConstrMethDecl {

    private ConstrMethDeclItemList constrMethDeclItemList;

    public ConstrMeth_Decl (ConstrMethDeclItemList constrMethDeclItemList) {
        this.constrMethDeclItemList=constrMethDeclItemList;
        if(constrMethDeclItemList!=null) constrMethDeclItemList.setParent(this);
    }

    public ConstrMethDeclItemList getConstrMethDeclItemList() {
        return constrMethDeclItemList;
    }

    public void setConstrMethDeclItemList(ConstrMethDeclItemList constrMethDeclItemList) {
        this.constrMethDeclItemList=constrMethDeclItemList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(constrMethDeclItemList!=null) constrMethDeclItemList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(constrMethDeclItemList!=null) constrMethDeclItemList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(constrMethDeclItemList!=null) constrMethDeclItemList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstrMeth_Decl(\n");

        if(constrMethDeclItemList!=null)
            buffer.append(constrMethDeclItemList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstrMeth_Decl]");
        return buffer.toString();
    }
}
