package org.patterns.abstractfactory.highend;

import org.patterns.abstractfactory.Storage;

public class HighEndStorage implements Storage {
    @Override
    public String capacity() { return "2 TB SSD"; }
}
