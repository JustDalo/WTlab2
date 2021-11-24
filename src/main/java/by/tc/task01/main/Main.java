package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceCostComparator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaKettle = new Criteria(SearchCriteria.VacuumCleaner.getApplianceGroup()); //"Kettle"
		List<Appliance> appliances = service.find(criteriaKettle);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		PrintApplianceInfo.print(service.findApplianceWithMinCost(new ApplianceCostComparator()));

	}
}
