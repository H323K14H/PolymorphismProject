import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HangarTest {

    Hangar hangar;

    @BeforeEach
    void setUp() {
        hangar = new Hangar("Hangar 1");
    }

    @Test
    void canGetName(){
        assertThat(hangar.getName()).isEqualTo("Hangar 1");
    }

    @Test
    void canCountVehicles() {
    assertThat(hangar.countVehicles()).isEqualTo(0);
    }

    @Test
    void canAddVehicle() {
        CruiseShip cruiseShip1 = new CruiseShip("Big one", 100_000, "Sea", 3_000, false);

        hangar.addVehicle(cruiseShip1);
        assertThat(hangar.countVehicles()).isEqualTo(1);
    }

}
