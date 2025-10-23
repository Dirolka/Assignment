package assigment5.decarator;

import assigment5.Bicycle;
import assigment5.details.RimSpec;

public class RimDecorator extends BikeDecorator {
    private final RimSpec rim;

    public RimDecorator(Bicycle base, RimSpec rim) {
        super(base);
        this.rim = rim;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " + Rims: " + rim.getSizeMm() + "mm";
    }

    @Override
    public double getCost() {
        return base.getCost() + rim.getExtraCost();
    }
}
