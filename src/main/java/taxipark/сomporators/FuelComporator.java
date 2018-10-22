package taxipark.сomporators;

import entities.FuelCar;
import enums.SortEnum;

import java.util.Comparator;

/**
 * Class for comparing Fuel cars
 */
public class FuelComporator implements Comparator<FuelCar> {
    private SortEnum sortingIndex;

    public FuelComporator(SortEnum sortingIndex) {
        this.sortingIndex = sortingIndex;
    }

    public SortEnum getSortingIndex() {
        return sortingIndex;
    }

    @Override
    public int compare(FuelCar o1, FuelCar o2) {
        switch (sortingIndex) {
            case FUEL_ECONOMY:
                return o1.getFuelConsumption() - o2.getFuelConsumption();
//            case MAX_SPEED:
//                return o1.getMaxSpeed() - o2.getMaxSpeed();
        }
        return 0;

    }
}
