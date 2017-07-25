public class Yard extends Length {
    public static final int RATE = 12 * 3;
    public static final String NAME = "YARD";

    public Yard(int value) {
        super(value);
    }

    @Override
    protected int toValueOfBaseUnit() {
        return this.value * 3 * 12;
    }
}
