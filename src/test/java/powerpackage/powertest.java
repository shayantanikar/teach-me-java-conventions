package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class powertest {
    @Test
    public void one_raised_to_one_is_onew() {
        assertEquals(1, powerfinder.OF(1, 1));
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assertEquals(2, powerfinder.OF(2, 1));
    }

    @Test
    public void two_power_2_is_4() {
        assertEquals(4, powerfinder.OF(2, 2));
    }

    @Test
    public void power_of_2_and_3_Is_SIX() {
        assertEquals(9, powerfinder.OF(3, 2));
    }
}
