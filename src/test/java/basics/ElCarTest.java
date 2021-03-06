package basics;

import enums.SortEnum;
import taxipark.сomporators.ElectricComporator;
import org.testng.annotations.BeforeMethod;

abstract public class ElCarTest extends BasicCarTest {

    protected ElectricComporator elComp;

    @BeforeMethod
    protected void getElComp() {
        elComp = new ElectricComporator(SortEnum.LIFE_TIME_BUTTERY);
    }
}