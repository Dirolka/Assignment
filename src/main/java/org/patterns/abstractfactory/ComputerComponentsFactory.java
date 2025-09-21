package org.patterns.abstractfactory;

public interface ComputerComponentsFactory {
    CPU createCPU();
    GPU createGPU();
    RAM createRAM();
    Storage createStorage();
}
