package design_patterns.adapter_design;

public class Iphone {
    private AppleCharger appleCharger;

    public Iphone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargePhone(){
        appleCharger.chargePhone();
       // System.out.println("Iphone is changing");
    }
}
