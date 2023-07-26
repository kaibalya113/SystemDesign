package design_patterns.Decorator;

public class GrandFather extends IHuman {

    @Override
    public String asset() {
        return super.asset() + " 100";
    }

    @Override
    public String inheritedProperty() {
        return super.inheritedProperty() + " LAND";
    }
}
