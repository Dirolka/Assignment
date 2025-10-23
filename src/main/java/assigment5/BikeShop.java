package assigment5;
import assigment5.details.ColorSpec;
import assigment5.details.FrameSpec;
import assigment5.details.HandlebarSpec;
import assigment5.details.RimSpec;

public class BikeShop {
    public Bicycle buildBike(ColorSpec color, FrameSpec frame, HandlebarSpec handlebar, RimSpec rim) {
        return BikeFacade.create()
                .withColor(color)
                .withFrame(frame)
                .withHandlebar(handlebar)
                .withRim(rim)
                .build();
    }

    public Bicycle buildBike(String color, String frame, String handlebar, String rim) {
        return BikeFacade.create()
                .withColor(color)
                .withFrame(frame)
                .withHandlebar(handlebar)
                .withRim(rim)
                .build();
    }
}
