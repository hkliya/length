import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

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
        return toYardValue() == anotherLength.value;
    }

    private int toYardValue() {
        return this.value * 1760;
    }
}
