package assigment5.decarator;

import assigment5.Bicycle;
import assigment5.details.HandlebarSpec;

public class HandlebarDecorator extends BikeDecorator {
    private final HandlebarSpec handlebar;

    public HandlebarDecorator(Bicycle base, HandlebarSpec handlebar) {
        super(base);
        this.handlebar = handlebar;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " + Handlebars: " + handlebar.getType();
    }

    @Override
    public double getCost() {
        return base.getCost() + handlebar.getExtraCost();
    }
}
