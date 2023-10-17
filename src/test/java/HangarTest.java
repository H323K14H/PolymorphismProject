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
    void canGetName() {
        assertThat(hangar.getName()).isEqualTo("Hangar 1");
    }

    @Test
    void canCountVehicles() {
        assertThat(hangar.countVehicles()).isEqualTo(0);
    }

    @Test
    void canAddVehicle() {
        CruiseShip Wonder_Of_The_Sea = new CruiseShip("Wonder of the Sea", 100_000, "Sea", 3_000, false);

        Helicopter Eurocopter_X3 = new Helicopter("Eurocopter X3", 100_000, "Air", 5, 18_500);

        Bicycle The_Comet = new Bicycle("The Comet", 450, "Land", 2, 7);

        hangar.addVehicle(Wonder_Of_The_Sea);
        hangar.addVehicle(Eurocopter_X3);
        hangar.addVehicle(The_Comet);

        assertThat(hangar.countVehicles()).isEqualTo(3);
    }

}
