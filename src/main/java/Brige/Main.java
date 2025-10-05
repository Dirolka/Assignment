package Brige;
import Brige.FrameMaterial.FrameMaterialAluminium;
import Brige.Shape.Badfast;


public class Main {
    public static void main(String[] args) {
        Badfast badfast = new Badfast(new FrameMaterialAluminium());
        badfast.assemble();
    }
}