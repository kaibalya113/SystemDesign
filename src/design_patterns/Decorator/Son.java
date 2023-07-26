package design_patterns.Decorator;

public class Son extends Father{
    public Son(GrandFather grandFather) {
        super(grandFather);
    }
    @Override
    public String asset() {
        return super.asset() + " 9000";
    }

    @Override
    public String inheritedProperty() {
        return super.inheritedProperty() +" Town";
    }
}
