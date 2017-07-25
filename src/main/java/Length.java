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
        if (this.unit.equals(anotherLength.unit)) {
            return this.value == anotherLength.value;
        }
        return toMinimumUnitValue() == anotherLength.toMinimumUnitValue();
    }

    private int toMinimumUnitValue() {
        if (this.unit.equals(Unit.MILE)) {
            return this.value * 1760 * 3 * 12;
        }

        if (this.unit.equals(Unit.YARD)) {
            return this.value * 3 * 12;
        }

        if (this.unit.equals(Unit.FEET)) {
            return this.value * 12;
        }

        return this.value;
    }
}
