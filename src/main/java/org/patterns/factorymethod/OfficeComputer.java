package org.patterns.factorymethod;

public class OfficeComputer implements ComputerProduct {
    @Override
    public String getDescription() {
        return "Office Computer: Intel i5, 16GB RAM, 512GB SSD, Integrated Graphics";
    }
}
