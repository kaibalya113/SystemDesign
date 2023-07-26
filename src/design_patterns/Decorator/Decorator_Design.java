package design_patterns.Decorator;

public class Decorator_Design {
    public static void main(String[] args){
//        Human human = new Father(new GrandFather());
//        System.out.println(human.inheritedProperty());

        IHuman human = new Son(new Father(new GrandFather()));
        System.out.println(human.asset());
        System.out.println(human.inheritedProperty());
    }
}