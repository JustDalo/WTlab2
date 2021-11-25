package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Comparator;
import java.util.List;

public interface ApplianceService {

    /**
     * @param criteria by which to find
     * @return list of appliances
     */
    List<Appliance> find(Criteria criteria);

    /**
     * @param comparator
     * @return list of appliances sorted by cost
     */
    List<Appliance> findApplianceWithMinCost(Comparator<Appliance> comparator);
}
