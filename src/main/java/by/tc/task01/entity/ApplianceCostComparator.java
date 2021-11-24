package by.tc.task01.entity;

import java.util.Comparator;

public class ApplianceCostComparator implements Comparator<Appliance> {
    @Override
    public int compare(Appliance appliance1, Appliance appliance2) {
        return Math.round(appliance1.getCost() - appliance2.getCost());
    }
}
