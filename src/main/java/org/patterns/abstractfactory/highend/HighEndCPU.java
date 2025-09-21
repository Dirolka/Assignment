package org.patterns.abstractfactory.highend;

import org.patterns.abstractfactory.CPU;

public class HighEndCPU implements CPU {
    @Override
    public String model() { return "Intel Core i9"; }
}
