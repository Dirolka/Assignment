package org.patterns.factorymethod;

public class GamingComputer implements ComputerProduct {
    @Override
    public String getDescription() {
        return "Gaming Computer: Intel i9, 32GB RAM, 2TB SSD, NVIDIA RTX 4090";
    }
}
