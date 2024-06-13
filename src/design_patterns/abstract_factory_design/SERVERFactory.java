package design_patterns.abstract_factory_design;

public class SERVERFactory implements ComputerAbstractFactory{
    private String RAM;
    private String CPU;
    private String HDD;

    public SERVERFactory(String RAM, String CPU, String HDD) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new Server(RAM, CPU, HDD);
    }
}
