package org.patterns.abstractfactory;

public class AssembledComputer {
    private final CPU cpu;
    private final GPU gpu;
    private final RAM ram;
    private final Storage storage;

    public AssembledComputer(ComputerComponentsFactory factory) {
        this.cpu = factory.createCPU();
        this.gpu = factory.createGPU();
        this.ram = factory.createRAM();
        this.storage = factory.createStorage();
    }

    @Override
    public String toString() {
        return "AssembledComputer{" +
                "CPU=" + cpu.model() +
                ", GPU=" + gpu.model() +
                ", RAM=" + ram.size() +
                ", Storage=" + storage.capacity() +
                '}';
    }
}
