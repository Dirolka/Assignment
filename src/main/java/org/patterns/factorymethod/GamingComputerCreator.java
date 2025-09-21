package org.patterns.factorymethod;

public class GamingComputerCreator extends ComputerCreator {
    @Override
    protected ComputerProduct createComputer() {
        return new GamingComputer();
    }
}
