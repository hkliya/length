import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class LengthTest {
    @Test
    public void should_test_mile_equality() {
        assertThat(new Length(3, Unit.MILE)).isEqualTo(new Length(3, Unit.MILE));
        assertThat(new Length(3, Unit.MILE)).isNotEqualTo(new Length(2, Unit.MILE));
        assertThat(new Length(3, Unit.MILE)).isNotEqualTo(new Length(4, Unit.MILE));
    }
}
