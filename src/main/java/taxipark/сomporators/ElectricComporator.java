package taxipark.сomporators;

import enums.SortEnum;
import entities.ElectricCar;

import java.util.Comparator;

/**
 * Class for comparing Electric cars
 */
public class ElectricComporator implements Comparator<ElectricCar> {

    private SortEnum sortingIndex;

    public ElectricComporator(SortEnum sortingIndex) {
        this.sortingIndex = sortingIndex;
    }

    public SortEnum getSortingIndex() {
        return sortingIndex;
    }

    @Override
    public int compare(ElectricCar o1, ElectricCar o2) {
        switch (sortingIndex) {
            case LIFE_TIME_BUTTERY:
                return  o1.getLifetimeBattery() - o2.getLifetimeBattery();
        }
        return 0;
    }


}
