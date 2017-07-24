public class Volume extends Quantity {
    public Volume(int value) {
        super(value);
    }

    public Quantity add(Quantity anotherQuantity) {
        return new TSP(getSumOfBaseUnitValue(anotherQuantity));
    }

}
