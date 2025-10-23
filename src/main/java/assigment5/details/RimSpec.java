package assigment5.details;

public final class RimSpec {
    private final int sizeMm;
    private final double extraCost;

    private RimSpec(int sizeMm, double extraCost) {
        this.sizeMm = sizeMm;
        this.extraCost = extraCost;
    }

    public static RimSpec of(int sizeMm) {
        double cost;
        if (sizeMm == 30) cost = 50.0;
        else if (sizeMm == 40) cost = 80.0;
        else if (sizeMm == 50) cost = 110.0;
        else cost = 70.0; // default for other sizes
        return new RimSpec(sizeMm, cost);
    }

    public static RimSpec parse(String value) {
        if (value == null || value.trim().isEmpty()) return null;
        String v = value.trim().toLowerCase().replace("mm", "");
        try {
            int mm = Integer.parseInt(v);
            return of(mm);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid rim size: " + value);
        }
    }

    public int getSizeMm() {
        return sizeMm;
    }

    public double getExtraCost() {
        return extraCost;
    }
}
