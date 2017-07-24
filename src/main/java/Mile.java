public class Mile extends Length {

    public Mile(int value) {
        super(value);
    }

    @Override
    protected int toValueOfBaseUnit() {
        return value * 1760 * 12 * 3;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
