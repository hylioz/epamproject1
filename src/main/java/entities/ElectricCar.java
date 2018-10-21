package entities;

import Enums.CarTypeEnum;
import Enums.ManufacturerEnum;

import java.time.Year;

/**
 * Entity electric car
 */
public class ElectricCar extends Car {
    private String batteryType;
    private int chargingTime;
    private int lifetimeBattery;

    public ElectricCar(ManufacturerEnum manufacturer, String model, CarTypeEnum bodyType, String engineType, int maxSpeed, Integer price, Year year, int numberOfSeats, boolean automaticTransmission, String batteryType, int chargingTime, int lifetimeBattery) {
        super(manufacturer, model, bodyType, engineType, maxSpeed, price, year, numberOfSeats, automaticTransmission);
        this.batteryType = batteryType;
        this.chargingTime = chargingTime;
        this.lifetimeBattery = lifetimeBattery;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public int getLifetimeBattery() {
        return lifetimeBattery;
    }

    @Override
    public String toString() {
        return "ElectricCar: " + super.toString() +
                "batteryType = " + batteryType +
                ", chargingTime = " + chargingTime +
                ", lifetimeBattery = " + lifetimeBattery+ "\n";
    }
}
