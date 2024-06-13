package design_patterns.adapter_pattern_new;

public class XMLFile implements XML{
    @Override
    public void readXML() {
        System.out.println("I am reading XML File");
    }
}
