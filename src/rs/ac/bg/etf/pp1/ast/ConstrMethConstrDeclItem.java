// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ConstrMethConstrDeclItem extends ConstrMethDeclItemList {

    private ConstructorDeclarationList constructorDeclarationList;

    public ConstrMethConstrDeclItem (ConstructorDeclarationList constructorDeclarationList) {
        this.constructorDeclarationList=constructorDeclarationList;
        if(constructorDeclarationList!=null) constructorDeclarationList.setParent(this);
    }

    public ConstructorDeclarationList getConstructorDeclarationList() {
        return constructorDeclarationList;
    }

    public void setConstructorDeclarationList(ConstructorDeclarationList constructorDeclarationList) {
        this.constructorDeclarationList=constructorDeclarationList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(constructorDeclarationList!=null) constructorDeclarationList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(constructorDeclarationList!=null) constructorDeclarationList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(constructorDeclarationList!=null) constructorDeclarationList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstrMethConstrDeclItem(\n");

        if(constructorDeclarationList!=null)
            buffer.append(constructorDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstrMethConstrDeclItem]");
        return buffer.toString();
    }
}
