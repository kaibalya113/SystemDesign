package design_patterns.abstract_factory_design;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}
