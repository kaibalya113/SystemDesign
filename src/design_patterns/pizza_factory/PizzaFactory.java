package design_patterns.pizza_factory;

public class PizzaFactory {
    public Pizza CreatePizza(String PizzaName){
        Pizza pizza = null;
        if(PizzaName == null || PizzaName == ""){
            return null;
        }
        if(PizzaName.equalsIgnoreCase("ClamPizza")){
            pizza = new ClamPizza();
        }
        if(PizzaName.equalsIgnoreCase("VeggiePizza")){
            pizza = new VeggiePizza();
        }
        if(PizzaName.equalsIgnoreCase("PepperoniPizza")){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
