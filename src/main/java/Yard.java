public class Yard extends Length {
    public Yard(int value) {
        super(value);
    }

    @Override
    protected int toValueOfBaseUnit() {
        return this.value * 3 * 12;
    }
}
