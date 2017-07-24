public class Inch extends Length {
    public Inch(int value) {
        super(value);
    }

    @Override
    protected int toValueOfBaseUnit() {
        return this.value;
    }
}
