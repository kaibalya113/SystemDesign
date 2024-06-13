package design_patterns.adapter_design;

public class AppleChargerXYZ implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("Apple phone is charging");
    }
}
