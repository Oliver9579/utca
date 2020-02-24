package hu.street.model.domain;

public class House {

    private final boolean uneven;
    private final int fenceLength;
    private final String color;

    public House(boolean uneven, int fenceLength, String color) {
        this.uneven = uneven;
        this.fenceLength = fenceLength;
        this.color = color;
    }

    public boolean isUneven() {
        return uneven;
    }

    public int getFenceLength() {
        return fenceLength;
    }

    public String getColor() {
        return color;
    }
}
