package design_patterns.pizza_factory;

public class PizzaMainClass {
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
