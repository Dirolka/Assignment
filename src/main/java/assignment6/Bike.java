package assignment6;

import assignment6.strategy.ColorStrategy;
import assignment6.strategy.FrameStrategy;
import assignment6.strategy.HandlebarStrategy;
import assignment6.strategy.RimStrategy;

import java.util.Objects;

public final class Bike {
    private FrameStrategy frameStrategy;
    private HandlebarStrategy handlebarStrategy;
    private RimStrategy rimStrategy;
    private ColorStrategy colorStrategy;

    public Bike(FrameStrategy frameStrategy,
                HandlebarStrategy handlebarStrategy,
                RimStrategy rimStrategy,
                ColorStrategy colorStrategy) {
        this.frameStrategy = Objects.requireNonNull(frameStrategy, "frameStrategy");
        this.handlebarStrategy = Objects.requireNonNull(handlebarStrategy, "handlebarStrategy");
        this.rimStrategy = Objects.requireNonNull(rimStrategy, "rimStrategy");
        this.colorStrategy = Objects.requireNonNull(colorStrategy, "colorStrategy");
    }

    public void setFrameStrategy(FrameStrategy frameStrategy) {
        this.frameStrategy = Objects.requireNonNull(frameStrategy, "frameStrategy");
    }

    public void setHandlebarStrategy(HandlebarStrategy handlebarStrategy) {
        this.handlebarStrategy = Objects.requireNonNull(handlebarStrategy, "handlebarStrategy");
    }

    public void setRimStrategy(RimStrategy rimStrategy) {
        this.rimStrategy = Objects.requireNonNull(rimStrategy, "rimStrategy");
    }

    public void setColorStrategy(ColorStrategy colorStrategy) {
        this.colorStrategy = Objects.requireNonNull(colorStrategy, "colorStrategy");
    }

    public String describe() {
        StringBuilder description = new StringBuilder();
        description.append("Fixed Gear Bike\n");
        description.append("- Frame: ").append(frameStrategy.getName()).append('\n');
        description.append("- Handlebar: ").append(handlebarStrategy.getName()).append('\n');
        description.append("- Rim Depth: ").append(rimStrategy.getDepthMm()).append("mm\n");
        description.append("- Color: ").append(colorStrategy.getColorName());
        return description.toString();
    }
}


