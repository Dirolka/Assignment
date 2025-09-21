package org.patterns.abstractfactory.office;

import org.patterns.abstractfactory.CPU;

public class OfficeCPU implements CPU {
    @Override
    public String model() { return "Intel Core i5"; }
}
