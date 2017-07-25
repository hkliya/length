public abstract class Quantity {
    protected int value;

    public Quantity(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        Quantity quantity = (Quantity) o;
        return toValueOfBaseUnit() == quantity.toValueOfBaseUnit();
    }

    protected int toValueOfBaseUnit() {
        return 0;
    }

    public abstract Quantity add(Quantity anotherQuantity);

    protected int getSumOfBaseUnitValue(Quantity anotherQuantity) {
        return this.toValueOfBaseUnit() + anotherQuantity.toValueOfBaseUnit();
    }

}
