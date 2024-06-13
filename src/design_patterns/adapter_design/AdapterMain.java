package design_patterns.adapter_design;

public class AdapterMain {
    public static void main(String[] args){

        AppleCharger appleCharger = new AppleChargerXYZ();
        Iphone iphone = new Iphone(appleCharger);
        iphone.chargePhone();
    }

}
