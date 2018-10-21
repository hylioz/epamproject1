import Basics.ElCarTest;
import entities.ElectricCar;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElCarSortTests extends ElCarTest {

    private final static Logger LOGGER = Logger.getLogger(ElCarSortTests.class);

    @Test
    public void elCarSortGreaterTest() {
        ElectricCar electricCar1 = (ElectricCar) carPool.get(2);
        ElectricCar electricCar2 = (ElectricCar) carPool.get(4);;
        int result = elComp.compare(electricCar1, electricCar2);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void elCarSortLowerTest() {
        ElectricCar electricCar1 = (ElectricCar) carPool.get(4);
        ElectricCar electricCar2 = (ElectricCar) carPool.get(2);;
        int result = elComp.compare(electricCar1, electricCar2);
        Assert.assertEquals(result, -6);
    }

    @Test
    public void elCarSortEqualTest() {
        ElectricCar electricCar1 = (ElectricCar) carPool.get(4);
        ElectricCar electricCar2 = (ElectricCar) carPool.get(5);;
        int result = elComp.compare(electricCar1, electricCar2);
        Assert.assertEquals(result, 0);
    }
}
