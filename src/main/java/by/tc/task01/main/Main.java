package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
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

		Criteria criteriaKettle = new Criteria(SearchCriteria.Kettle.getApplianceGroup()); //"Kettle"
		List<Appliance> appliances = service.find(criteriaKettle);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

//		criteriaKettle = new Criteria(Oven.class.getSimpleName());
//		criteriaKettle.add(Oven.HEIGHT.toString(), 200);
//		criteriaKettle.add(Oven.DEPTH.toString(), 300);
//
//		appliance = service.find(criteriaKettle);
//
//	//	PrintApplianceInfo.print(appliance);
//
//		//////////////////////////////////////////////////////////////////
//
//		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
//		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
//		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
//		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);
//
//		appliance = service.find(criteriaKettle);// find(Object...obj)
//
//	//	PrintApplianceInfo.print(appliance);
//
	}
}
