public class Length extends Quantity {

    public Length(int value) {
        super(value);
    }

    public Quantity add(Quantity anotherQuantity) {
        return new Inch(getSumOfBaseUnitValue(anotherQuantity));
    }

}
