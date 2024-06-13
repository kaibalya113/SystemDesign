package design_patterns.abstract_factory_design;

public class MainMethod {
    public static void main(String[] args){
        Computer pc =  ComputerFactory.getComputer(new PCFactory("4GB", "2.4", "500"));
        System.out.println(pc.toString());
    }
}
