package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void OneRaisedToOneIsOne() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void TwoRaisedToOneIsTwo() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void TwoRaisedToTwoIsFour() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void ThreeRaisedToTwoIsNine() {
        assert powerfinder.OF(3, 2) == 3*3;
    }
}
