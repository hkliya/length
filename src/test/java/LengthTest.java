import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class LengthTest {
    @Test
    public void should_test_mile_equality() {
        assertThat(new Mile(3).equals(new Mile(3))).isTrue();
        assertThat(new Mile(3).equals(new Mile(2))).isFalse();
        assertThat(new Mile(3).equals(new Mile(4))).isFalse();
    }
    
    @Test
    public void should_test_yard_equality() {
        assertThat(new Yard(3).equals(new Yard(3))).isTrue();
        assertThat(new Yard(3).equals(new Yard(4))).isFalse();
    }
    
    @Test
    public void should_test_equality_between_mile_and_yard() {
        assertThat(new Mile(1).equals(new Yard(1760))).isTrue();
        assertThat(new Mile(1).equals(new Yard(1761))).isFalse();
    }
    
    @Test
    public void should_test_equality_between_yard_feet_and_inch() {
        assertThat(new Yard(1).equals(new Feet(3))).isTrue();
    }
    
    @Test
    public void should_add_different_length() {
        assertThat(new Inch(13).add(new Inch(11)).equals(new Feet(2))).isTrue();
        assertThat(new Feet(3).add(new Yard(2)).equals(new Yard(3))).isTrue();
    }

    @Test
    public void should_print() {
        assertThat(new Inch(14).toString()).isEqualTo("1 FEET 2 INCH");
        assertThat(new Inch(24).toString()).isEqualTo("2 FEET");
        assertThat(new Inch(39).toString()).isEqualTo("1 YARD 3 INCH");
        assertThat(new Yard(1762).toString()).isEqualTo("1 MILE 2 YARD");
    }
}
