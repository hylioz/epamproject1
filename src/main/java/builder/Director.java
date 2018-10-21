package builder;

import enums.CarTypeEnum;
import enums.ManufacturerEnum;
import org.apache.log4j.Logger;

import java.time.Year;

/**
 * Class for set values to the fields of the classes ElectricCarBuilder and FuelCarBuilder
 */
public class Director {

    private final static Logger LOGGER = Logger.getLogger(Director.class);

    public void constructFuelSportsCar(Builder builder) {
        builder.buildAutomaticTransmission(true);
        builder.buildCarType(CarTypeEnum.HATCHBACK);
        builder.buildEngineType("ICE");
        builder.buildManufacturer(ManufacturerEnum.BMW);
        builder.buildMaxSpeed(200);
        builder.buildModel("M3");
        builder.buildNumberOfSeats(4);
        builder.buildPrice(30_000);
        builder.buildYear(Year.of(2010));
        LOGGER.info("build constructFuelSportsCar");
    }

    public void constructFuelCityCar(Builder builder) {
        builder.buildAutomaticTransmission(false);
        builder.buildCarType(CarTypeEnum.SEDAN);
        builder.buildEngineType("ICE");
        builder.buildManufacturer(ManufacturerEnum.LADA);
        builder.buildMaxSpeed(180);
        builder.buildModel("Vesta");
        builder.buildNumberOfSeats(4);
        builder.buildPrice(15_000);
        builder.buildYear(Year.of(2006));
        LOGGER.info("build constructFuelCityCar");
    }

    public void constructFuelComfortCar(Builder builder) {
        builder.buildAutomaticTransmission(false);
        builder.buildCarType(CarTypeEnum.HATCHBACK);
        builder.buildEngineType("ICE");
        builder.buildManufacturer(ManufacturerEnum.CITROEN);
        builder.buildMaxSpeed(190);
        builder.buildModel("Xantia");
        builder.buildNumberOfSeats(4);
        builder.buildPrice(5_000);
        builder.buildYear(Year.of(2000));
        LOGGER.info("build constructFuelComfortCar");
    }

    public void constructElectricSportsCar(Builder builder) {
        builder.buildAutomaticTransmission(true);
        builder.buildCarType(CarTypeEnum.HATCHBACK);
        builder.buildEngineType("Electric");
        builder.buildManufacturer(ManufacturerEnum.TESLA);
        builder.buildMaxSpeed(200);
        builder.buildModel("Model-s");
        builder.buildNumberOfSeats(4);
        builder.buildPrice(90_000);
        builder.buildYear(Year.of(2016));
        LOGGER.info("build constructElectricSportsCar");
    }

    public void constructElectricCityCar(Builder builder) {
        builder.buildAutomaticTransmission(true);
        builder.buildCarType(CarTypeEnum.HATCHBACK);
        builder.buildEngineType("Electric");
        builder.buildManufacturer(ManufacturerEnum.FIAT);
        builder.buildMaxSpeed(150);
        builder.buildModel("500e");
        builder.buildNumberOfSeats(4);
        builder.buildPrice(32_000);
        builder.buildYear(Year.of(2015));
        LOGGER.info("build constructElectricCityCar");
    }

    public void constructElectricComfortCar(Builder builder) {
        builder.buildAutomaticTransmission(true);
        builder.buildCarType(CarTypeEnum.HATCHBACK);
        builder.buildEngineType("Electric");
        builder.buildManufacturer(ManufacturerEnum.NISSAN);
        builder.buildMaxSpeed(144);
        builder.buildModel("Leaf");
        builder.buildNumberOfSeats(4);
        builder.buildPrice(40_000);
        builder.buildYear(Year.of(2014));
        LOGGER.info("build constructElectricComfortCar");
    }
}
