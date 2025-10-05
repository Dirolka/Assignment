package Brige.Shape;
import Brige.FrameMaterial.FrameMaterial;

public class Netural extends FrameGeometry {

    public Netural(FrameMaterial framematerial) {
        super(framematerial);
    }

    @Override
    public void assemble() {
        System.out.println("Netural geometry");
        framematerial.frametype();
    }
}
