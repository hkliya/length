import java.util.ArrayList;
import java.util.stream.Collectors;

public class Length extends Quantity {

    public Length(int value, Unit unit) {
        super(value, unit);
    }

    @Override
    protected Unit getMinimumUnit() {
        return Unit.INCH;
    }

    @Override
    public String toString() {
        int minimumUnitValue = this.toMinimumUnitValue();
        int mile = minimumUnitValue / Unit.MILE.conversionRate();
        int yard = (minimumUnitValue - Unit.MILE.conversionRate() * mile) / Unit.YARD.conversionRate();
        int feet = (minimumUnitValue - Unit.MILE.conversionRate() * mile - Unit.YARD.conversionRate() * yard) / Unit.FEET.conversionRate();
        int inch = minimumUnitValue % Unit.FEET.conversionRate();

        ArrayList<String> list = new ArrayList<>();
        if (mile != 0) {
            list.add(String.valueOf(mile));
            list.add(Unit.MILE.name());
        }

        if (yard != 0) {
            list.add(String.valueOf(yard));
            list.add(Unit.YARD.name());
        }

        if (feet != 0) {
            list.add(String.valueOf(feet));
            list.add(Unit.FEET.name());
        }

        if (inch != 0) {
            list.add(String.valueOf(inch));
            list.add(Unit.INCH.name());
        }

        return list.stream().collect(Collectors.joining(DELIMITER));
    }

}
