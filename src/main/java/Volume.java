public class Volume extends Quantity {
    public Volume(int value, Unit unit) {
        super(value, unit);
    }

    @Override
    protected Unit getMinimumUnit() {
        return Unit.TSP;
    }
}
