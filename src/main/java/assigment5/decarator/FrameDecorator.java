package assigment5.decarator;

import assigment5.Bicycle;
import assigment5.details.FrameSpec;

public class FrameDecorator extends BikeDecorator {
    private final FrameSpec frame;

    public FrameDecorator(Bicycle base, FrameSpec frame) {
        super(base);
        this.frame = frame;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " + Frame: " + frame.getType();
    }

    @Override
    public double getCost() {
        return base.getCost() + frame.getExtraCost();
    }
}
