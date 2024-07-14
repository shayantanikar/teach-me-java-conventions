package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class powertest {
    @Test
    public void OneRaisedToOneIsOne() {
        assertEquals(1, powerfinder.OF(1, 1));
    }

    @Test
    public void TwoRaisedToOneIsTwo() {
        assertEquals(2, powerfinder.OF(2, 1));
    }

    @Test
    public void TwoRaisedToTwoIsFour() {
        assertEquals(4, powerfinder.OF(2, 2));
    }

    @Test
    public void ThreeRaisedToTwoIsNine() { assertEquals(9, powerfinder.OF(3, 2));
    }
}
