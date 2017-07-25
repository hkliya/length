import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Length extends Quantity {

    public static final String DELIMETER = " ";

    public Length(int value) {
        super(value);
    }

    public Quantity add(Quantity anotherQuantity) {
        return new Inch(getSumOfBaseUnitValue(anotherQuantity));
    }

    @Override
    public String toString() {
        int valueOfBaseUnit = toValueOfBaseUnit();
        int mile = valueOfBaseUnit / Mile.RATE;
        int yard = valueOfBaseUnit % Mile.RATE / Yard.RATE;
        int feet = valueOfBaseUnit % Yard.RATE / Feet.RATE;
        int inch = valueOfBaseUnit % Feet.RATE;

        List<String> list = new ArrayList<>();
        if (mile != 0) {
            list.add(String.valueOf(mile));
            list.add(Mile.NAME);
        }

        if (yard != 0) {
            list.add(String.valueOf(yard));
            list.add(Yard.NAME);
        }

        if (feet != 0) {
            list.add(String.valueOf(feet));
            list.add(Feet.NAME);
        }

        if (inch != 0) {
            list.add(String.valueOf(inch));
            list.add(Inch.NAME);
        }

        return list.stream().collect(joining(DELIMETER));
    }

    public String toInchString() {
        return toValueOfBaseUnit() + DELIMETER + Inch.NAME;
    }
}
