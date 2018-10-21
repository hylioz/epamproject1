package entities;

import Enums.CarTypeEnum;
import Enums.ManufacturerEnum;

import java.time.Year;

/**
 * Entity fuel car
 */
public class FuelCar extends Car {
    private int fuelConsumption;
    private int tankCapacity;
    private String fuelType;

    public FuelCar(ManufacturerEnum manufacturer, String model, CarTypeEnum bodyType, String engineType, int maxSpeed, Integer price, Year year, int numberOfSeats, boolean automaticTransmission, int fuelConsumption, int tankCapacity, String fuelType) {
        super(manufacturer, model, bodyType, engineType, maxSpeed, price, year, numberOfSeats, automaticTransmission);
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.fuelType = fuelType;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "FuelCar: " + super.toString() + " " +
                "fuelConsumption = " + fuelConsumption +
                ", tankCapacity = " + tankCapacity +
                ", fuelType = " + fuelType + "\n";
    }
}
