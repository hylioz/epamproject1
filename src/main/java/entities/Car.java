package entities;

import enums.CarTypeEnum;
import enums.ManufacturerEnum;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Year;

/**
 * Entity car
 */
abstract public class Car {
    @NotNull(message = "Manufacturer must be set")
    private ManufacturerEnum manufacturer;
    private String model;
    private CarTypeEnum bodyType;
    private String engineType;

    @Size(min = 50, max = 400, message = "Max speed should be in range(50, 400)")
    private int maxSpeed;
    @Size(min = 100, max = 400000, message = "Price should be in range(100, 400000)")
    private int price;
    @Size(min = 1950, max = 2018, message = "Year should be in range(1950, 2018)")
    private Year year;
    @Size(min = 2, max = 10, message = "Number of seats should be in range(2, 10)")
    private int numberOfSeats;
    private boolean automaticTransmission;

    protected Car(ManufacturerEnum manufacturer, String model, CarTypeEnum bodyType, String engineType, int maxSpeed, Integer price, Year year, int numberOfSeats, boolean automaticTransmission) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.year = year;
        this.numberOfSeats = numberOfSeats;
        this.automaticTransmission = automaticTransmission;
    }

    public ManufacturerEnum getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public CarTypeEnum getBodyType() {
        return bodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public Year getYear() {
        return year;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    @Override
    public String toString() {
        return "manufacturer = " + manufacturer +
                ", model = " + model +
                ", bodyType = " + bodyType +
                ", engineType = " + engineType +
                ", maxSpeed = " + maxSpeed +
                ", price = " + price +
                ", year = " + year +
                ", numberOfSeats = " + numberOfSeats +
                ", automaticTransmission = " + automaticTransmission;
    }
}

//private int mileage;
//private int power;
//private float acceleration;
//private int maxSpeed;
//private int torque;
