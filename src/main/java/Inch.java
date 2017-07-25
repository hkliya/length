public class Inch extends Length {
    public static final String NAME = "INCH";

    public Inch(int value) {
        super(value);
    }

    @Override
    protected int toValueOfBaseUnit() {
        return this.value;
    }
}
