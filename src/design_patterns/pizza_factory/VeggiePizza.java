package design_patterns.pizza_factory;

public class VeggiePizza implements Pizza{

    @Override
    public void createPizza() {
        System.out.println("Veggie Created");
    }
}
