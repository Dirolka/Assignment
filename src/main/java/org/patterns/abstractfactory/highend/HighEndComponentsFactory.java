package org.patterns.abstractfactory.highend;

import org.patterns.abstractfactory.*;

public class HighEndComponentsFactory implements ComputerComponentsFactory {
    @Override
    public CPU createCPU() { return new HighEndCPU(); }

    @Override
    public GPU createGPU() { return new HighEndGPU(); }

    @Override
    public RAM createRAM() { return new HighEndRAM(); }

    @Override
    public Storage createStorage() { return new HighEndStorage(); }
}
