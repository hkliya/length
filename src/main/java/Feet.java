public class Feet extends Length {
    public static final String NAME = "FEET";
    public static final int RATE = 12;

    public Feet(int value) {
        super(value);
    }

    @Override
    protected int toValueOfBaseUnit() {
        return this.value * RATE;
    }
}
