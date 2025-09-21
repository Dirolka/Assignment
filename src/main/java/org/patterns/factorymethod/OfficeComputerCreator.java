package org.patterns.factorymethod;

public class OfficeComputerCreator extends ComputerCreator {
    @Override
    protected ComputerProduct createComputer() {
        return new OfficeComputer();
    }
}
