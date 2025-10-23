package assigment5.decarator;

import assigment5.Bicycle;

public abstract class BikeDecorator implements Bicycle {
    protected final Bicycle base;

    protected BikeDecorator(Bicycle base) {
        this.base = base;
    }

    @Override
    public String getDescription() {
        return base.getDescription();
    }

    @Override
    public double getCost() {
        return base.getCost();
    }
}
