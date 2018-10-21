package biulder;

import enums.CarTypeEnum;
import enums.ManufacturerEnum;
import entities.FuelCar;
import org.apache.log4j.Logger;

import java.time.Year;

/**
 * Class to create a new object for the class FuelCar
 */
public class FuelCarBuilder implements Builder {

    private final static Logger LOGGER = Logger.getLogger(FuelCarBuilder.class);

    private ManufacturerEnum manufacturer;
    private String model;
    private CarTypeEnum bodyType;

    private String engineType;
    private int maxSpeed;
    private int price;

    private Year year;
    private int numberOfSeats;
    private boolean automaticTransmission;

    @Override
    public void buildManufacturer(ManufacturerEnum manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void buildModel(String model) {
        this.model = model;
    }

    @Override
    public void buildCarType(CarTypeEnum bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void buildEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void buildPrice(int price) {
        this.price = price;
    }

    @Override
    public void buildYear(Year year) {
        this.year = year;
    }

    @Override
    public void buildNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void buildAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    /**
     * Create new FuelCar
     */
    public FuelCar getResult(int fuelConsumption, int tankCapacity, String fuelType) {
        LOGGER.info("create new FuelCar");
        return new FuelCar(manufacturer, model, bodyType, engineType, maxSpeed, price, year, numberOfSeats, automaticTransmission, fuelConsumption, tankCapacity, fuelType);
    }
}
