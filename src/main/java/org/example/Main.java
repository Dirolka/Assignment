package org.example;

public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.ComputerBuilder("1 TB", "16 GB", "Intel i9")
                .setGPU("NVIDIA RTX 4090")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(gamingPC);

        Computer officePC = new Computer.ComputerBuilder("500 GB", "8 GB", "Intel i5")
                .setBluetoothEnabled(false)
                .build();

        System.out.println(officePC);
    }
}
