package org.example;

public class Computer {
    private String HDD;

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    private String RAM;
    private String CPU;

    private String GPU;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", CPU=" + CPU + ", GPU=" + GPU + ", GraphicsCard=" + isGraphicsCardEnabled + ", Bluetooth=" + isBluetoothEnabled + "]";
    }

    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private String CPU;

        private String GPU;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM, String CPU) {
            this.HDD = HDD;
            this.RAM = RAM;
            this.CPU = CPU;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
