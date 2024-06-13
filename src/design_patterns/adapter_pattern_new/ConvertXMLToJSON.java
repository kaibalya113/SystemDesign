package design_patterns.adapter_pattern_new;

public class ConvertXMLToJSON implements JSON{
    XML xml;
    public ConvertXMLToJSON(XML xml){
        this.xml = xml;
    }
    @Override
    public void readJSON() {
        xml.readXML();
        System.out.println("I am reading XML data to JSON");
    }
}
