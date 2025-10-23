package assigment5;

public class BaseBike implements Bicycle {
    @Override
    public String getDescription() {
        return "Bicycle";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}
