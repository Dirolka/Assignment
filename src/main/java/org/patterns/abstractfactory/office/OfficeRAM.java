package org.patterns.abstractfactory.office;

import org.patterns.abstractfactory.RAM;

public class OfficeRAM implements RAM {
    @Override
    public String size() { return "16 GB"; }
}
