package design_patterns.factory_design_pattern;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)){
            return new PC(ram, hdd, cpu);
        }else if("SERVER".equalsIgnoreCase(type)){
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
