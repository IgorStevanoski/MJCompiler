// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class Constructors extends ConstructorDeclarationList {

    private ConstructorDeclarationList constructorDeclarationList;
    private ConstructorDeclaration constructorDeclaration;

    public Constructors (ConstructorDeclarationList constructorDeclarationList, ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclarationList=constructorDeclarationList;
        if(constructorDeclarationList!=null) constructorDeclarationList.setParent(this);
        this.constructorDeclaration=constructorDeclaration;
        if(constructorDeclaration!=null) constructorDeclaration.setParent(this);
    }

    public ConstructorDeclarationList getConstructorDeclarationList() {
        return constructorDeclarationList;
    }

    public void setConstructorDeclarationList(ConstructorDeclarationList constructorDeclarationList) {
        this.constructorDeclarationList=constructorDeclarationList;
    }

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration=constructorDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(constructorDeclarationList!=null) constructorDeclarationList.accept(visitor);
        if(constructorDeclaration!=null) constructorDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(constructorDeclarationList!=null) constructorDeclarationList.traverseTopDown(visitor);
        if(constructorDeclaration!=null) constructorDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(constructorDeclarationList!=null) constructorDeclarationList.traverseBottomUp(visitor);
        if(constructorDeclaration!=null) constructorDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Constructors(\n");

        if(constructorDeclarationList!=null)
            buffer.append(constructorDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(constructorDeclaration!=null)
            buffer.append(constructorDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Constructors]");
        return buffer.toString();
    }
}
