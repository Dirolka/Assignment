package org.patterns.abstractfactory.highend;

import org.patterns.abstractfactory.RAM;

public class HighEndRAM implements RAM {
    @Override
    public String size() { return "32 GB"; }
}
