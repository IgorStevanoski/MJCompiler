// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ConstrMethBothItems extends ConstrMethDeclItemList {

    private ConstructorDeclarationList constructorDeclarationList;
    private MethodDeclarationList methodDeclarationList;

    public ConstrMethBothItems (ConstructorDeclarationList constructorDeclarationList, MethodDeclarationList methodDeclarationList) {
        this.constructorDeclarationList=constructorDeclarationList;
        if(constructorDeclarationList!=null) constructorDeclarationList.setParent(this);
        this.methodDeclarationList=methodDeclarationList;
        if(methodDeclarationList!=null) methodDeclarationList.setParent(this);
    }

    public ConstructorDeclarationList getConstructorDeclarationList() {
        return constructorDeclarationList;
    }

    public void setConstructorDeclarationList(ConstructorDeclarationList constructorDeclarationList) {
        this.constructorDeclarationList=constructorDeclarationList;
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
        if(constructorDeclarationList!=null) constructorDeclarationList.accept(visitor);
        if(methodDeclarationList!=null) methodDeclarationList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(constructorDeclarationList!=null) constructorDeclarationList.traverseTopDown(visitor);
        if(methodDeclarationList!=null) methodDeclarationList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(constructorDeclarationList!=null) constructorDeclarationList.traverseBottomUp(visitor);
        if(methodDeclarationList!=null) methodDeclarationList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstrMethBothItems(\n");

        if(constructorDeclarationList!=null)
            buffer.append(constructorDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(methodDeclarationList!=null)
            buffer.append(methodDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstrMethBothItems]");
        return buffer.toString();
    }
}
