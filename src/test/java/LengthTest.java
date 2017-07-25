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
    }
}
