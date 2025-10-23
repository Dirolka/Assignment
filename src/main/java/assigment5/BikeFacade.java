package assigment5;

import assigment5.decarator.ColorDecorator;
import assigment5.decarator.FrameDecorator;
import assigment5.decarator.HandlebarDecorator;
import assigment5.decarator.RimDecorator;
import assigment5.details.ColorSpec;
import assigment5.details.FrameSpec;
import assigment5.details.HandlebarSpec;
import assigment5.details.RimSpec;


public final class BikeFacade {
    private ColorSpec color;
    private FrameSpec frame;
    private HandlebarSpec handlebar;
    private RimSpec rim;

    private BikeFacade() {}

    public static BikeFacade create() {
        return new BikeFacade();
    }

    public BikeFacade withColor(ColorSpec color) {
        this.color = color;
        return this;
    }

    public BikeFacade withColor(String color) {
        this.color = (color == null || color.trim().isEmpty()) ? null : ColorSpec.of(color);
        return this;
    }

    public BikeFacade withFrame(FrameSpec frame) {
        this.frame = frame;
        return this;
    }

    public BikeFacade withFrame(String frame) {
        this.frame = (frame == null || frame.trim().isEmpty()) ? null : FrameSpec.of(frame);
        return this;
    }

    public BikeFacade withHandlebar(HandlebarSpec handlebar) {
        this.handlebar = handlebar;
        return this;
    }

    public BikeFacade withHandlebar(String handlebar) {
        this.handlebar = (handlebar == null || handlebar.trim().isEmpty()) ? null : HandlebarSpec.of(handlebar);
        return this;
    }

    public BikeFacade withRim(RimSpec rim) {
        this.rim = rim;
        return this;
    }

    public BikeFacade withRim(String rim) {
        this.rim = (rim == null || rim.trim().isEmpty()) ? null : RimSpec.parse(rim);
        return this;
    }

    public Bicycle build() {
        Bicycle bike = new BaseBike();
        if (color != null) bike = new ColorDecorator(bike, color);
        if (frame != null) bike = new FrameDecorator(bike, frame);
        if (handlebar != null) bike = new HandlebarDecorator(bike, handlebar);
        if (rim != null) bike = new RimDecorator(bike, rim);
        return bike;
    }

    public String description() {
        return build().getDescription();
    }

    public double previewCost() {
        return build().getCost();
    }

    public BikeFacade reset() {
        this.color = null;
        this.frame = null;
        this.handlebar = null;
        this.rim = null;
        return this;
    }
}
