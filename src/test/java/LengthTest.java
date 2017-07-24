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
}
