package Brige.Shape;
import Brige.FrameMaterial.FrameMaterial;

public class Softcock extends FrameGeometry{

    public Softcock(FrameMaterial framematerial) {
        super(framematerial);
    }
    @Override
    public void assemble() {
        System.out.println("Softcock geometry");
        framematerial.frametype();
    }
}
