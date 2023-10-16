import org.junit.jupiter.api.BeforeEach;

public class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicle = new Vehicle("Car", 50_000, "Land", 5);
    }
}
