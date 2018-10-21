package basics;

import builderr.BuildCars;
import entities.Car;
import entities.ElectricCar;
import entities.FuelCar;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

public abstract class BasicCarTest {

    protected ArrayList<Car> carPool;

    @BeforeMethod
    protected void getCarPool() {

        ElectricCar tesla = BuildCars.getElectricCar("lithium", 9, 20, "Sport");

        ElectricCar nissan = BuildCars.getElectricCar("lithium", 16, 14, "City");

        ElectricCar fiat = BuildCars.getElectricCar("lithium", 14, 14, "Comfort");

        FuelCar bmw = BuildCars.getFuelCar(8, 45, "diesel", "Sport");

        FuelCar citroen = BuildCars.getFuelCar(8, 50, "petrol", "Comfort");

        FuelCar lada = BuildCars.getFuelCar(7, 40, "petrol", "City");

        carPool = new ArrayList<Car>() {
            {
                this.add(citroen);
                this.add(bmw);
                this.add(tesla);
                this.add(lada);
                this.add(nissan);
                this.add(fiat);
            }
        };
    }
}
