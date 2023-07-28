// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Methods extends MethodDeclarationList {

    private MethodDeclarationList methodDeclarationList;
    private MethodDeclaration methodDeclaration;

    public Methods (MethodDeclarationList methodDeclarationList, MethodDeclaration methodDeclaration) {
        this.methodDeclarationList=methodDeclarationList;
        if(methodDeclarationList!=null) methodDeclarationList.setParent(this);
        this.methodDeclaration=methodDeclaration;
        if(methodDeclaration!=null) methodDeclaration.setParent(this);
    }

    public MethodDeclarationList getMethodDeclarationList() {
        return methodDeclarationList;
    }

    public void setMethodDeclarationList(MethodDeclarationList methodDeclarationList) {
        this.methodDeclarationList=methodDeclarationList;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration=methodDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(methodDeclarationList!=null) methodDeclarationList.accept(visitor);
        if(methodDeclaration!=null) methodDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(methodDeclarationList!=null) methodDeclarationList.traverseTopDown(visitor);
        if(methodDeclaration!=null) methodDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(methodDeclarationList!=null) methodDeclarationList.traverseBottomUp(visitor);
        if(methodDeclaration!=null) methodDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Methods(\n");

        if(methodDeclarationList!=null)
            buffer.append(methodDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(methodDeclaration!=null)
            buffer.append(methodDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Methods]");
        return buffer.toString();
    }
}
