import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class LengthTest {
    @Test
    public void should_test_mile_equality() {
        assertThat(new Length(3, Unit.MILE)).isEqualTo(new Length(3, Unit.MILE));
        assertThat(new Length(3, Unit.MILE)).isNotEqualTo(new Length(2, Unit.MILE));
        assertThat(new Length(3, Unit.MILE)).isNotEqualTo(new Length(4, Unit.MILE));
    }
    
    @Test
    public void should_test_yard_equality() {
        assertThat(new Length(3, Unit.YARD)).isEqualTo(new Length(3, Unit.YARD));
        assertThat(new Length(3, Unit.YARD)).isNotEqualTo(new Length(4, Unit.YARD));
    }
    
    @Test
    public void should_test_equality_with_different_units() {
        assertThat(new Length(1, Unit.MILE).equals(new Length(1760, Unit.YARD))).isTrue();
        assertThat(new Length(1, Unit.MILE).equals(new Length(1761, Unit.YARD))).isFalse();
        assertThat(new Length(1, Unit.YARD).equals(new Length(3, Unit.FEET))).isTrue();
        assertThat(new Length(1, Unit.FEET).equals(new Length(12, Unit.INCH))).isTrue();
    }
    
    @Test
    public void should_add_length() {
        assertThat(new Length(13, Unit.INCH).plus(new Length(11, Unit.INCH)).equals(new Length(2, Unit.FEET)));
        assertThat(new Length(3, Unit.FEET).plus(new Length(2, Unit.YARD)).equals(new Length(3, Unit.YARD)));
    }
    
    @Test
    public void should_print_length() {
        assertThat(new Length(14, Unit.INCH).toString()).isEqualTo("1 FEET 2 INCH");
        assertThat(new Length(24, Unit.INCH).toString()).isEqualTo("2 FEET");
        assertThat(new Length(39, Unit.INCH).toString()).isEqualTo("1 YARD 3 INCH");
        assertThat(new Length(1762, Unit.YARD).toString()).isEqualTo("1 MILE 2 YARD");
    }
}
