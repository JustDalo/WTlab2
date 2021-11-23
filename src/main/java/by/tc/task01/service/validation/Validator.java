package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Set;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		switch (criteria.getGroupSearchName()){
			case "Kettle" -> {
				return KettleValidator(criteria);
			}
		}

		return true;
	}

	private static boolean KettleValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "weight", "capacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return true;
					};
				}
				default -> {
					return true;
				}
			}
		}
		return false;
	}

}

//you may add your own new classes