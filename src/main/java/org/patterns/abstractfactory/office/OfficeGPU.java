package org.patterns.abstractfactory.office;

import org.patterns.abstractfactory.GPU;

public class OfficeGPU implements GPU {
    @Override
    public String model() { return "Integrated Graphics"; }
}
