package org.patterns.abstractfactory.office;

import org.patterns.abstractfactory.*;

public class OfficeComponentsFactory implements ComputerComponentsFactory {
    @Override
    public CPU createCPU() { return new OfficeCPU(); }

    @Override
    public GPU createGPU() { return new OfficeGPU(); }

    @Override
    public RAM createRAM() { return new OfficeRAM(); }

    @Override
    public Storage createStorage() { return new OfficeStorage(); }
}
