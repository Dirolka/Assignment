package assignment6;

import assignment6.strategy.color.BlackColor;
import assignment6.strategy.color.BlueColor;
import assignment6.strategy.frame.BadfastFrame;
import assignment6.strategy.frame.NeturalFrame;
import assignment6.strategy.frame.SoftcockFrame;
import assignment6.strategy.handlebar.BullhornHandlebar;
import assignment6.strategy.handlebar.DropBarsHandlebar;
import assignment6.strategy.rim.Rim30;
import assignment6.strategy.rim.Rim40;
import assignment6.strategy.rim.Rim55;

public final class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(
                new SoftcockFrame(),
                new BullhornHandlebar(),
                new Rim40(),
                new BlueColor()
        );

        System.out.println(bike.describe());

        bike.setFrameStrategy(new NeturalFrame());
        bike.setHandlebarStrategy(new DropBarsHandlebar());
        bike.setRimStrategy(new Rim55());
        bike.setColorStrategy(new BlackColor());

        System.out.println();
        System.out.println("After swapping strategies at runtime:");
        System.out.println(bike.describe());

        bike.setFrameStrategy(new BadfastFrame());
        bike.setRimStrategy(new Rim30());
        bike.setColorStrategy(new BlueColor());

        System.out.println();
        System.out.println("Another configuration:");
        System.out.println(bike.describe());
    }
}


