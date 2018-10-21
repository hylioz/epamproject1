package builderr;

import enums.CarTypeEnum;
import enums.ManufacturerEnum;

import java.time.Year;

/**
 * Interface Builder which is inherited by ElectricCarBuilder and FuelCarBuilder
 */
public interface Builder {
    void buildManufacturer(ManufacturerEnum manufacturer);

    void buildModel(String model);

    void buildCarType(CarTypeEnum bodyType);

    void buildEngineType(String engineType);

    void buildMaxSpeed(int maxSpeed);

    void buildPrice(int price);

    void buildYear(Year year);

    void buildNumberOfSeats(int numberOfSeats);

    void buildAutomaticTransmission(boolean automaticTransmission);
}
