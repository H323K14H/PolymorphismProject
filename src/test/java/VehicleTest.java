import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Helicopter helicopter;
    CruiseShip cruiseShip;

    Bicycle bicycle;

    @BeforeEach
    void setUp() {
        helicopter = new Helicopter("Choppa", 50_000, "Land", 5, 17000);

        cruiseShip = new CruiseShip("7 Seas", 50_000_000, "Sea", 4_000, true);

        bicycle = new Bicycle("Helicopter", 50_000, "Land", 5, 2);
    }

    @Test
    void canGetName() {
        assertThat(helicopter.getName()).isEqualTo("Choppa");
    }

    @Test
    void canGetCost() {
        assertThat(cruiseShip.getCost()).isEqualTo(50_000_000);
    }

    @Test
    void canGetTransportationMode() {
        assertThat(bicycle.getTransportationMode()).isEqualTo("Land");
    }

    @Test
    void canGetSeatingCapacity() {
        assertThat(helicopter.getSeatingCapacity()).isEqualTo(5);
    }

}
