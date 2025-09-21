package org.patterns.abstractfactory.office;

import org.patterns.abstractfactory.Storage;

public class OfficeStorage implements Storage {
    @Override
    public String capacity() { return "512 GB SSD"; }
}
