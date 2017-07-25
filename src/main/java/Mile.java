public class Mile extends Length {

    public static final String NAME = "MILE";
    public static final int RATE = 1760 * 3 * 12;

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
