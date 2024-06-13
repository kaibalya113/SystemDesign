package design_patterns.adapter_pattern_new;

public class JSONFile implements JSON{
    @Override
    public void readJSON() {
        System.out.println("I am reading JSON File");
    }
}
