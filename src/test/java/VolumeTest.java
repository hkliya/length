import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class VolumeTest {
    @Test
    public void should_test_equality() {
        assertThat(new TSP(1).equals(new TSP(1))).isTrue();
        assertThat(new TBSP(1).equals(new TBSP(1))).isTrue();
        assertThat(new TBSP(1).equals(new TSP(3))).isTrue();
        assertThat(new OZ(1).equals(new TBSP(2))).isTrue();
    }
    
    @Test
    public void should_add_different_volume() {
        assertThat(new TSP(4).add(new TSP(2)).equals(new OZ(1)));
    }
}
