public enum Unit {
    INCH(1),
    FEET(12 * INCH.conversionRate),
    YARD(3 * FEET.conversionRate),
    MILE(1760 * YARD.conversionRate),
    TSP(1),
    TBSP(3 * TSP.conversionRate()),
    OZ(2 * TBSP.conversionRate());

    private int conversionRate;

    Unit(int conversionRate) {
        this.conversionRate = conversionRate;
    }

    public int conversionRate() {
        return conversionRate;
    }
}
