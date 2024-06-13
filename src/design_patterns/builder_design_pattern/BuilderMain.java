package design_patterns.builder_design_pattern;

public class BuilderMain {
    public static void main(String[] args){
        Computer c = new Computer.ComputerBuilder("512GB", "4GB").setColor("black").setScreen("32inch").build();
        Computer comp = new Computer.ComputerBuilder("512TB", "40GB").setColor("white").setScreen("55inch").build();
        System.out.println(c.toString());
        System.out.println(comp.toString());
    }
}
