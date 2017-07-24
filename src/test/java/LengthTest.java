import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class LengthTest {
    @Test
    public void should_test_equality() {
        assertThat(new Mile(3).equals(new Mile(3))).isTrue();
        assertThat(new Mile(3).equals(new Mile(2))).isFalse();
        assertThat(new Mile(3).equals(new Mile(4))).isFalse();
    }
}
