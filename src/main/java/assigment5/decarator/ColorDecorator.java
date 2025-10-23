package assigment5.decarator;

import assigment5.Bicycle;
import assigment5.details.ColorSpec;

public class ColorDecorator extends BikeDecorator {
    private final ColorSpec color;

    public ColorDecorator(Bicycle base, ColorSpec color) {
        super(base);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " + Color: " + color.getName();
    }

    @Override
    public double getCost() {
        return base.getCost() + color.getExtraCost();
    }
}
