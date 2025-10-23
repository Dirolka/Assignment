package assigment5.details;

public final class HandlebarSpec {
    private final String type;
    private final double extraCost;

    private HandlebarSpec(String type, double extraCost) {
        this.type = type;
        this.extraCost = extraCost;
    }

    public static HandlebarSpec of(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Handlebar type must not be empty");
        }
        return new HandlebarSpec(type.trim(), 70.0);
    }

    public static HandlebarSpec of(String type, double extraCost) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Handlebar type must not be empty");
        }
        return new HandlebarSpec(type.trim(), extraCost);
    }

    public String getType() {
        return type;
    }

    public double getExtraCost() {
        return extraCost;
    }
}
