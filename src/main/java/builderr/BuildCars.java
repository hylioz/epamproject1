package builderr;

import entities.Car;
import entities.ElectricCar;
import entities.FuelCar;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class BuildCars {

    private final static Logger LOGGER = Logger.getLogger(BuildCars.class);


    private static Director director = new Director();

    public static ElectricCar getElectricCar(String batteryType, int charginTime, int lifetimeBattery, String type){
        ElectricCarBuilder electricBuilder = new ElectricCarBuilder();

        if(type.equals("Sport")){
            director.constructElectricSportsCar(electricBuilder);
        }
        else if(type.equals("City")){
            director.constructElectricCityCar(electricBuilder);
        }
        else if(type.equals("Comfort")){
            director.constructElectricComfortCar(electricBuilder);
        }
        else {
            LOGGER.info("Error type of car in {getElectricCar}");
        }

        return electricBuilder.getResult(batteryType, charginTime, lifetimeBattery);
    }

    public static FuelCar getFuelCar(int fuelConsumption, int tankCapacity, String fuelType, String type){
        FuelCarBuilder fuelBuilder = new FuelCarBuilder();

        if(type.equals("Sport")){
            director.constructFuelSportsCar(fuelBuilder);
        }
        else if(type.equals("City")){
            director.constructFuelCityCar(fuelBuilder);
        }
        else if(type.equals("Comfort")){
            director.constructFuelComfortCar(fuelBuilder);
        }
        else {
            LOGGER.info("Error type of car in {getFuelCar}");
        }

        return fuelBuilder.getResult(fuelConsumption, tankCapacity, fuelType);
    }

    public static ArrayList<Car> getCars(){
        Director director = new Director();
        ElectricCarBuilder electricBuilder = new ElectricCarBuilder();

        director.constructElectricSportsCar(electricBuilder);
        ElectricCar tesla = electricBuilder.getResult("lithium", 9, 20);

        director.constructElectricCityCar(electricBuilder);
        ElectricCar nissan = electricBuilder.getResult("lithium", 16, 14);

        director.constructElectricComfortCar(electricBuilder);
        ElectricCar fiat = electricBuilder.getResult("lithium", 14, 14);

        FuelCarBuilder fuelBuilder = new FuelCarBuilder();

        director.constructFuelSportsCar(fuelBuilder);
        FuelCar bmw = fuelBuilder.getResult(8, 45, "diesel");

        director.constructFuelComfortCar(fuelBuilder);
        FuelCar citroen = fuelBuilder.getResult(8, 50, "petrol");

        director.constructFuelCityCar(fuelBuilder);
        FuelCar lada = fuelBuilder.getResult(7, 40, "petrol");

//        return new ArrayList<Car>() {
//            {
//                this.add(citroen);
//                this.add(bmw);
//                this.add(tesla);
//                this.add(lada);
//                this.add(nissan);
//                this.add(fiat);
//
//            }
//        };
        return null;
    }
}
