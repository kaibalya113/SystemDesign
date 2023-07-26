package design_patterns.Decorator;

public class Father extends GrandFather{
    GrandFather grandFather;
    public Father(GrandFather grandFather){
        this.grandFather = grandFather;
    }

    @Override
    public String asset() {
        return super.asset() + " 1000";
    }

    @Override
    public String inheritedProperty() {
        return super.inheritedProperty() +" House";
    }
}
