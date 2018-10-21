import Basics.FuCarTest;
import TaxiPark.TaxiStation;
import entities.FuelCar;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FuCarSortTests extends FuCarTest {

    private final static Logger LOGGER = Logger.getLogger(FuCarSortTests.class);

    @Test
    public void fuCarSortGreaterTest() {
        FuelCar fuelCar1 = (FuelCar) carPool.get(0);
        FuelCar fuelCar2 = (FuelCar) carPool.get(3);
        int result = fuComp.compare(fuelCar1, fuelCar2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void fuCarSortLowerTest() {
        FuelCar fuelCar1 = (FuelCar) carPool.get(3);
        FuelCar fuelCar2 = (FuelCar) carPool.get(0);
        int result = fuComp.compare(fuelCar1, fuelCar2);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void fuCarSortEqualTest() {
        FuelCar fuelCar1 = (FuelCar) carPool.get(0);
        FuelCar fuelCar2 = (FuelCar) carPool.get(1);
        int result = fuComp.compare(fuelCar1, fuelCar2);
        Assert.assertEquals(0, result);
    }
}
