import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class VolumeTest {
    @Test
    public void should_test_equality() {
        assertThat(new Volume(1, Unit.TBSP)).isEqualTo(new Volume(1, Unit.TBSP));
        assertThat(new Volume(1, Unit.TBSP)).isNotEqualTo(new Volume(2, Unit.TBSP));
        assertThat(new Volume(1, Unit.TSP)).isNotEqualTo(new Volume(2, Unit.TSP));
        assertThat(new Volume(1, Unit.OZ).equals(new Volume(2, Unit.TBSP))).isTrue();
    }
    
    @Test
    public void should_plus_different_volume() {
        Volume oneTBSP = new Volume(1, Unit.TBSP);
        Volume oneOZ = new Volume(1, Unit.OZ);
        Volume threeTBSP = new Volume(3, Unit.TBSP);

        Quantity result = oneTBSP.plus(oneOZ);

        assertThat(result.equals(threeTBSP)).isTrue();
    }
}
