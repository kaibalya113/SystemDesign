package design_patterns.pizza_abstract_factory;

public class ClamPizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("ClamPizza Created");
    }
}
