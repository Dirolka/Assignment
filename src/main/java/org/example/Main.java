package org.example;

import org.patterns.factorymethod.*;
import org.patterns.abstractfactory.*;
import org.patterns.abstractfactory.highend.HighEndComponentsFactory;
import org.patterns.abstractfactory.office.OfficeComponentsFactory;

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

        Computer basicPC = new Computer.ComputerBuilder("256 GB","16","Interl i3")
                .setGPU("NVIDIA 1050TI")
                .build();

        basicPC.setRAM("RAM 32GB");


        System.out.println(basicPC);

        System.out.println("--- Factory Method Demo ---");
        ComputerCreator gamingCreator = new GamingComputerCreator();
        ComputerCreator officeCreator = new OfficeComputerCreator();
        System.out.println(gamingCreator.orderComputer().getDescription());
        System.out.println(officeCreator.orderComputer().getDescription());


        System.out.println("--- Abstract Factory Demo ---");
        AssembledComputer highEndPC = new AssembledComputer(new HighEndComponentsFactory());
        AssembledComputer officePC2 = new AssembledComputer(new OfficeComponentsFactory());
        System.out.println(highEndPC);
        System.out.println(officePC2);
    }
}
