public enum Unit {
    INCH(1),
    FEET(12 * INCH.conversionRate),
    YARD(3 * FEET.conversionRate),
    MILE(1760 * YARD.conversionRate);

    private int conversionRate;

    Unit(int conversionRate) {
        this.conversionRate = conversionRate;
    }

    public int conversionRate() {
        return conversionRate;
    }
}
