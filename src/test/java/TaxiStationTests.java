import basics.BasicCarTest;
import taxipark.TaxiStation;
import entities.Car;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TaxiStationTests extends BasicCarTest {

    private final static Logger LOGGER = Logger.getLogger(TaxiStationTests.class);

    @Test
    public void calcCostTest() {
        int result = TaxiStation.calcCost(carPool);
        Assert.assertEquals(212_000, result);
    }

    @Test
    public void searchBySpeedTest() {
        ArrayList<Car> cars = TaxiStation.SearchBySpeed(carPool, 180, 210);
        String result = cars.get(0).getManufacturer().toString();
        result += cars.get(1).getManufacturer().toString();
        Assert.assertEquals("CITROENBMW", result);
    }
    @Test

    public void searchBySpeedTestIncorrect() {
        ArrayList<Car> cars = TaxiStation.SearchBySpeed(carPool, 210, 180);
        Assert.assertEquals(null, cars);
    }
}
