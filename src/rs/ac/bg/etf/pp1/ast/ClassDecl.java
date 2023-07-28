// generated with ast extension for cup
// version 0.8
// 15/0/2023 20:0:23


package rs.ac.bg.etf.pp1.ast;

public class ClassDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String className;
    private TypeExtended typeExtended;
    private ClassDeclItemList classDeclItemList;

    public ClassDecl (String className, TypeExtended typeExtended, ClassDeclItemList classDeclItemList) {
        this.className=className;
        this.typeExtended=typeExtended;
        if(typeExtended!=null) typeExtended.setParent(this);
        this.classDeclItemList=classDeclItemList;
        if(classDeclItemList!=null) classDeclItemList.setParent(this);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className=className;
    }

    public TypeExtended getTypeExtended() {
        return typeExtended;
    }

    public void setTypeExtended(TypeExtended typeExtended) {
        this.typeExtended=typeExtended;
    }

    public ClassDeclItemList getClassDeclItemList() {
        return classDeclItemList;
    }

    public void setClassDeclItemList(ClassDeclItemList classDeclItemList) {
        this.classDeclItemList=classDeclItemList;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(typeExtended!=null) typeExtended.accept(visitor);
        if(classDeclItemList!=null) classDeclItemList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(typeExtended!=null) typeExtended.traverseTopDown(visitor);
        if(classDeclItemList!=null) classDeclItemList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(typeExtended!=null) typeExtended.traverseBottomUp(visitor);
        if(classDeclItemList!=null) classDeclItemList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDecl(\n");

        buffer.append(" "+tab+className);
        buffer.append("\n");

        if(typeExtended!=null)
            buffer.append(typeExtended.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(classDeclItemList!=null)
            buffer.append(classDeclItemList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDecl]");
        return buffer.toString();
    }
}
