public class Length {
    private final int value;
    private final Unit unit;

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Length anotherLength = (Length) obj;
        return toMinimumUnitValue() == anotherLength.toMinimumUnitValue();
    }

    private int toMinimumUnitValue() {
        return this.value * unit.conversionRate();
    }
}
