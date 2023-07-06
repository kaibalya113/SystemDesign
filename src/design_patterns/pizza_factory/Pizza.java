package design_patterns.pizza_factory;

public interface Pizza {
    void createPizza();

    // common method for implementation of pizza
    default void prepare(){
        System.out.println("Pizza is preparing");
    }
    default void bake(){
        System.out.println("Pizza is baking");
    }
    default void cut(){
        System.out.println("Pizza is cutting");
    }
    default void box(){
        System.out.println("Pizza is packed");
    }
}
