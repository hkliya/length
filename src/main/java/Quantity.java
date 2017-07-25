public class Quantity {
    public static final String DELIMITER = " ";
    protected final int value;
    protected final Unit unit;

    public Quantity(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Quantity anotherQuantity = (Quantity) obj;
        return toMinimumUnitValue() == anotherQuantity.toMinimumUnitValue();
    }

    protected int toMinimumUnitValue() {
        return this.value * unit.conversionRate();
    }

    public Quantity plus(Quantity quantity) {
        return new Quantity(this.toMinimumUnitValue() + quantity.toMinimumUnitValue(), getMinimumUnit());
    }

    protected Unit getMinimumUnit() {
        return null;
    }

    public String toStringInMinimumUnit() {
        return toMinimumUnitValue() + DELIMITER + getMinimumUnit().name();
    }
}
