package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    /**
     * @param criteria by which to find
     * @return list of appliances
     */
    public List<Appliance> find(Criteria criteria) {
        if (Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliance = applianceDAO.find(criteria);

        return appliance;
    }

    /**
     * find appliances with min cost
     *
     * @param comparator
     * @return list of appliances sorted by cost
     */
    public List<Appliance> findApplianceWithMinCost(Comparator<Appliance> comparator) {
        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();
        List<Appliance> appliances = applianceDAO.getAll();
        appliances.sort(comparator);

        return getAppliancesWithMinCost(appliances);
    }


    /**
     * find appliances with min cost
     *
     * @param appliances sorted list of appliances
     * @return list of appliances sorted by cost
     */
    private List<Appliance> getAppliancesWithMinCost(List<Appliance> appliances) {
        List<Appliance> appliancesWithMinCost = new ArrayList<>();
        Appliance appliance = appliances.get(0);
        float minimalCost = appliance.getCost();
        int i = 1;
        while (appliance.getCost() == minimalCost) {
            appliancesWithMinCost.add(appliance);
            appliance = appliances.get(i);
            i++;
        }
        return appliancesWithMinCost;
    }
}
