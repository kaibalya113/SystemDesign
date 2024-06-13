package design_patterns.builder;

public class Computer {

    // while creating computer object below 2 fields are compolsory
    private String Ram;
    private String Hdd;

    // optional fields
    private boolean isGraphics;
    private boolean isBluetooth;

    public String getRam() {
        return Ram;
    }

    public String getHdd() {
        return Hdd;
    }

    public boolean isGraphics() {
        return isGraphics;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }

    //
    public Computer(ComputerBuilder builder){
        this.Ram = builder.Ram;
        this.Hdd = builder.Hdd;
        this.isBluetooth = builder.isBluetooth;
        this.isGraphics = builder.isGraphics;
    }

    public static class ComputerBuilder{
        // required
        private String Ram;
        private String Hdd;

        // optional fields
        private boolean isGraphics;
        private boolean isBluetooth;

        public ComputerBuilder(String ram, String hdd) {
            this.Ram = ram;
            this.Hdd = hdd;
        }

        public ComputerBuilder setGraphics(boolean graphics) {
            this.isGraphics = true;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean bluetooth){
            isBluetooth =  true;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }


}
