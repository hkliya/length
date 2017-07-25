public class Length extends Quantity {
    public Length(int value, Unit unit) {
        super(value, unit);
    }

    @Override
    protected Unit getMinimumUnit() {
        return Unit.INCH;
    }
}
