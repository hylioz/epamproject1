package taxipark;

import entities.Car;
import entities.ElectricCar;
import entities.FuelCar;
import enums.SortEnum;
import org.apache.log4j.Logger;
import taxipark.сomporators.ElectricComporator;
import taxipark.сomporators.FuelComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Methods for manipulating cars
 */
public class TaxiStation {

    private final static Logger LOGGER = Logger.getLogger(TaxiStation.class);

    /**
     * @return the cost of all cars in the collection
     */
    public static Integer calcCost(List<Car> autoPool) {
        LOGGER.info("{begin method calcCost");
        int price = 0;
        if (!autoPool.isEmpty()) {
            for (Car car : autoPool) {
                LOGGER.trace("calculate price in calcCost method");
                price += car.getPrice();

            }
        } else {
            LOGGER.info("Collection is empty");
            return null;
        }
        LOGGER.info("end method calcCost}");
        return price;
    }

    /**
     * @return a collection of cars with a maximum speed in the specified range
     */

    public static ArrayList<Car> SearchBySpeed(ArrayList<Car> cars, int min, int max) {
        LOGGER.info("{begin method SearchBySpeed");
        if (min > max)
            return null;
            ArrayList<Car> carSelection = new ArrayList<>();

        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                carSelection.add(car);
                LOGGER.trace("add car by speed");
            }
        }
        LOGGER.info("end method SearchBySpeed}");
        return carSelection;
    }

    /**
     * @return collection sorted by consumption
     */
    public static ArrayList<Car> SortByFuelСonsumption(ArrayList<Car> cars) {
        LOGGER.info("{begin method SortByFuelConsumption");
        ArrayList<ElectricCar> electricCars = new ArrayList<>();
        ArrayList<FuelCar> fuelCars = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof ElectricCar) {
                electricCars.add((ElectricCar) car);
                LOGGER.trace("add car in electric car");
            }
            if (car instanceof FuelCar) {
                fuelCars.add((FuelCar) car);
                LOGGER.trace("add car in fuel car");
            }
        }
//        fuelCars.sort((FuelCar car1, FuelCar car2) -> Integer.compare(car1.getFuelConsumption(), car2.getFuelConsumption()));
//        electricCars.sort((car1, car2) -> car1.getLifetimeBattery().compareTo(car2.getLifetimeBattery()));

        ElectricComporator elComp = new ElectricComporator(SortEnum.LIFE_TIME_BUTTERY);
        FuelComporator fuComp = new FuelComporator(SortEnum.FUEL_ECONOMY);

        Collections.sort(electricCars, elComp);
        Collections.sort(fuelCars, fuComp);

        ArrayList<Car> result = new ArrayList<>();
        result.addAll(electricCars);
        result.addAll(fuelCars);
        LOGGER.info("end method SortByFuelConsumption}");
        return result;
    }

}
