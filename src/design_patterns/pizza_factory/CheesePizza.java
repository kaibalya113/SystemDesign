package design_patterns.pizza_factory;

public class CheesePizza implements Pizza{

    @Override
    public void createPizza() {
        System.out.println("CheesePizza Created");
    }
}
