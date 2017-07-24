public class Yard extends Length {
    public Yard(int value) {
        super(value);
    }

    @Override
    protected int toYardValue() {
        return this.value;
    }
}
