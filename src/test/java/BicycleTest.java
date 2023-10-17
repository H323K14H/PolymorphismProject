import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BicycleTest {

    Bicycle bicycle;

    @BeforeEach
    void setUp() {
        bicycle = new Bicycle("The Comet", 450, "Land", 1, 7);
    }

    @Test
    void canGetNumberOfGears() {
        assertThat(bicycle.getNumberOfGears()).isEqualTo(7);
    }

    @Test
    void canCountAccessories() {
        assertThat(bicycle.countAccessories()).isEqualTo(0);
    }

    @Test
    void canAddAccessories() {
        bicycle.addAccessory("Lights");
        bicycle.addAccessory("Phone mount");
        bicycle.addAccessory("Bell");
        assertThat(bicycle.countAccessories()).isEqualTo(3);
    }


}
