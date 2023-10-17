import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {

    Helicopter helicopter;

    @BeforeEach
    void setUp() {
        helicopter = new Helicopter("Choppa", 2_000_000, "Air", 5, 18_500);
    }

    @Test
    void canCheckAltitude() {
        assertThat(helicopter.checkAltitude()).isEqualTo(18_500);
    }

}
