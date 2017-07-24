public class Feet extends Length {
    public Feet(int value) {
        super(value);
    }

    @Override
    protected int toValueOfBaseUnit() {
        return this.value * 12;
    }
}
