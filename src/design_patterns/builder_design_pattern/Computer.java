package design_patterns.builder_design_pattern;

public class Computer {
    // required parameter
    private String HDD;
    private String RAM;

    // optional parameter
    private String color;
    private String screen;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getColor() {
        return color;
    }

    public String getScreen() {
        return screen;
    }

    public Computer(ComputerBuilder computerBuilder){
        this.RAM = computerBuilder.RAM;
        this.HDD = computerBuilder.HDD;
        this.color = computerBuilder.color;
        this.screen = computerBuilder.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", color='" + color + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    // create a builder nested class
    public static class ComputerBuilder{
        // required parameter
        private String HDD;
        private String RAM;

        // optional parameter
        private String color;
        private String screen;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ComputerBuilder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
