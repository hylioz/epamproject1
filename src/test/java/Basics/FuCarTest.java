package Basics;

import Enums.SortEnum;
import TaxiPark.Comporators.FuelComporator;
import org.testng.annotations.BeforeMethod;

abstract public class FuCarTest extends BasicCarTest {

    protected FuelComporator fuComp;

    @BeforeMethod
    protected void getElComp() {
        fuComp = new FuelComporator(SortEnum.FUEL_ECONOMY);
    }
}