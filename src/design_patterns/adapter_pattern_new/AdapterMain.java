package design_patterns.adapter_pattern_new;

public class AdapterMain {
    public static void main(String[] args){
        XML xml = new XMLFile();
        //xml.readXML();

//        JSON json = new JSONFile();
//        json.readJSON();

        // we can imagine xml and json are both application
        // xml receive the xml data and read them
        // in another app json receive the json data then read them
        // now we want to integrate xml data to json to read file
        // so xml data will come to json and convert them to json and read data.
        JSON json1 = new ConvertXMLToJSON(xml);
        json1.readJSON();
    }
}
