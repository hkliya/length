public class Mile extends Length {

    public Mile(int value) {
        super(value);
    }

    @Override
    protected int toYardValue() {
        return value * 1760;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
