import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CruiseShipTest {

    CruiseShip cruiseShip;

    @BeforeEach
    void setUp() {
        cruiseShip = new CruiseShip("Big one", 100_000, "Sea", 3_000, false);
    }

    @Test
    void checkIfDiningAvailable(){
        assertThat(cruiseShip.checkDining()).isEqualTo(false);
    }

    @Test
    void canCountActivities() {
        assertThat(cruiseShip.countActivities()).isEqualTo(0);
    }

    @Test
    void canAddActivity() {
        cruiseShip.addActivity("Water boarding");
        cruiseShip.addActivity("Cooking class");
        assertThat(cruiseShip.countActivities()).isEqualTo(2);
    }
}
