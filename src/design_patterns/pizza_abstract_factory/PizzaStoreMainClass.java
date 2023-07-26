package design_patterns.pizza_abstract_factory;

public class PizzaStoreMainClass {
    public static void main(String[] args){
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.CreatePizza("PepperoniPizza");
        pizza.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
}
