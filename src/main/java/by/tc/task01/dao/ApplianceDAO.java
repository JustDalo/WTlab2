package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    /**
     * @param criteria by which to find
     * @return list of appliances
     */
    List<Appliance> find(Criteria criteria);

    /**
     * @return list of all appliances
     */
    List<Appliance> getAll();
}
