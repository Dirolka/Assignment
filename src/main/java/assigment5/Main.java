package assigment5;
import assigment5.details.ColorSpec;
import assigment5.details.FrameSpec;
import assigment5.details.HandlebarSpec;
import assigment5.details.RimSpec;

public class Main {
    public static void main(String[] args) {
        BikeShop shop = new BikeShop();
        Bicycle bike1 = shop.buildBike(ColorSpec.of("red"), FrameSpec.of("softcock"), HandlebarSpec.of("drop bars"), RimSpec.of(40));
        System.out.println(bike1.getDescription());
        System.out.println(bike1.getCost());

        Bicycle bike2 = shop.buildBike("blue", "netural", "bullgorns", "50mm");
        System.out.println(bike2.getDescription());
        System.out.println(bike2.getCost());

        Bicycle bike3 = shop.buildBike(null, FrameSpec.of("badfast"), null, RimSpec.of(30));
        System.out.println(bike3.getDescription());
        System.out.println(bike3.getCost());
    }
}
