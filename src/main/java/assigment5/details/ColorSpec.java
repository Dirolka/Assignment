package assigment5.details;

public final class ColorSpec {
    private final String name;
    private final double extraCost;

    private ColorSpec(String name, double extraCost) {
        this.name = name;
        this.extraCost = extraCost;
    }

    public static ColorSpec of(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Color name must not be empty");
        }
        return new ColorSpec(name.trim(), 20.0);
    }

    public String getName() {
        return name;
    }

    public double getExtraCost() {
        return extraCost;
    }
}
