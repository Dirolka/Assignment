package org.patterns.factorymethod;

public abstract class ComputerCreator {
    // Factory Method
    protected abstract ComputerProduct createComputer();

    // Optional: some common preparation/steps
    public ComputerProduct orderComputer() {
        ComputerProduct product = createComputer();
        // Additional steps (assemble, test, pack) could go here
        return product;
    }
}
