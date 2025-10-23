package assigment5.details;

public final class FrameSpec {
    private final String type;
    private final double extraCost;

    private FrameSpec(String type, double extraCost) {
        this.type = type;
        this.extraCost = extraCost;
    }

    public static FrameSpec of(String type, double extraCost) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Frame type must not be empty");
        }
        return new FrameSpec(type.trim(), extraCost);
    }

    public static FrameSpec of(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Frame type must not be empty");
        }
        String t = type.trim().toLowerCase();
        double cost;
        switch (t) {
            case "softcock":
                cost = 150.0;
                break;
            case "netural":
                cost = 100.0;
                break;
            case "badfast":
                cost = 220.0;
                break;
            default:
                cost = 120.0;
        }
        return new FrameSpec(type.trim(), cost);
    }

    public String getType() {
        return type;
    }

    public double getExtraCost() {
        return extraCost;
    }
}
