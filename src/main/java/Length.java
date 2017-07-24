public class Length {
    protected int value;

    public Length(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        Length length = (Length) o;
        return toValueOfBaseUnit() == length.toValueOfBaseUnit();
    }

    protected int toValueOfBaseUnit() {
        return 0;
    }

    public Length add(Length anotherLength) {
        return new Inch(this.toValueOfBaseUnit() + anotherLength.toValueOfBaseUnit());
    }

}
