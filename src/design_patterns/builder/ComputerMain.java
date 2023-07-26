package design_patterns.builder;

public class ComputerMain {
    public static void main(String[] args){
        Computer computer = new Computer.ComputerBuilder("16", "512").build();
        System.out.println(computer.getHdd()+":  "+computer.getRam()+":  "+computer.isBluetooth()+":  "+computer.isGraphics());
    }
}
