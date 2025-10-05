package Brige.Shape;

import Brige.FrameMaterial.FrameMaterial;

public abstract class FrameGeometry {
    public FrameMaterial framematerial;
    public FrameGeometry(FrameMaterial framematerial) {
        this.framematerial = framematerial;
    }
    public abstract void assemble();

}
