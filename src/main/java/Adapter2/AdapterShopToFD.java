package Adapter2;

public class AdapterShopToFD extends FixShop implements FixDetails {
    @Override
    public void lockring() {
        lockringOrdering();
    }

    @Override
    public void chain() {
        chainOrdering();
    }

    @Override
    public void pedals() {
        pedalsOrdering();
    }

    @Override
    public void bearings() {
        bearingsOrdering();
    }
}
