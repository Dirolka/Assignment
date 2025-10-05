package Brige.Shape;
import Brige.FrameMaterial.FrameMaterial;

public class Badfast extends FrameGeometry {
    public Badfast(FrameMaterial framematerial) {
        super(framematerial);
    }

    @Override
    public void assemble() {
        System.out.println("Badfast geometry");
        framematerial.frametype();
    }
}
