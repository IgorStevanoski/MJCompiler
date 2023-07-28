// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ConstrMethMethDeclItem extends ConstrMethDeclItemList {

    private MethodDeclarationList methodDeclarationList;

    public ConstrMethMethDeclItem (MethodDeclarationList methodDeclarationList) {
        this.methodDeclarationList=methodDeclarationList;
        if(methodDeclarationList!=null) methodDeclarationList.setParent(this);
    }

    public MethodDeclarationList getMethodDeclarationList() {
        return methodDeclarationList;
    }

    public void setMethodDeclarationList(MethodDeclarationList methodDeclarationList) {
        this.methodDeclarationList=methodDeclarationList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(methodDeclarationList!=null) methodDeclarationList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(methodDeclarationList!=null) methodDeclarationList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(methodDeclarationList!=null) methodDeclarationList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstrMethMethDeclItem(\n");

        if(methodDeclarationList!=null)
            buffer.append(methodDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstrMethMethDeclItem]");
        return buffer.toString();
    }
}
