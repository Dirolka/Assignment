package org.patterns.abstractfactory.highend;

import org.patterns.abstractfactory.GPU;

public class HighEndGPU implements GPU {
    @Override
    public String model() { return "NVIDIA RTX 4090"; }
}
