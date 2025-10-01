package Adapter2;

public class FixDetailsWholesaler {
    public static void main(String[] args) {
        FixDetails fixDetails = new AdapterShopToFD();

        fixDetails.lockring();
        fixDetails.chain();
        fixDetails.pedals();
        fixDetails.bearings();

    }

}
