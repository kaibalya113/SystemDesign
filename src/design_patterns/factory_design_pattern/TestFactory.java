package design_patterns.factory_design_pattern;

public class TestFactory {
    public static void main(String[] args){
        Computer comp = ComputerFactory.getComputer("PC", "2GB", "500SSD", "2.4Hz");
        System.out.println(comp.toString());
    }
}
