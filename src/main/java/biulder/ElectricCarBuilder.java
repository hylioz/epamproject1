package biulder;

import enums.CarTypeEnum;
import enums.ManufacturerEnum;
import entities.ElectricCar;
import org.apache.log4j.Logger;

import java.time.Year;

/**
 * Class to create a new object for the class ElectricCar
 */
public class ElectricCarBuilder implements Builder {

    private final static Logger LOGGER = Logger.getLogger(ElectricCarBuilder.class);

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
     * Create new ElectricCar
     */
    public ElectricCar getResult(String batteryType,int chargingTime, int lifetimeBattery) {
        LOGGER.info("create new ElectricCar");
        return new ElectricCar(manufacturer, model, bodyType, engineType, maxSpeed, price, year, numberOfSeats, automaticTransmission, batteryType, chargingTime, lifetimeBattery);
    }
}
