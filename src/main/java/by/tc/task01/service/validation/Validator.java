package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Set;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		switch (criteria.getGroupSearchName()){
			case "Kettle" -> {
				return KettleValidator(criteria);
			}
			case "Laptop" -> {
				return LaptopValidator(criteria);
			}
			case "Oven" -> {
				return OvenValidator(criteria);
			}
			case "Refrigerator" -> {
				return RefrigeratorValidator(criteria);
			}
			case "Speakers" -> {
				return SpeakersValidator(criteria);
			}
			case "TabletPC" -> {
				return TabletPCValidator(criteria);
			}
			case "VacuumCleaner" -> {
				return VacuumCleanerValidator(criteria);
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
					}
				}
				default -> {
					return false;
				}
			}
		}
		return false;
	}

	private static boolean LaptopValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "weight", "capacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return true;
					}
				}
				case "CPU", "batteryCapacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Float")){
						return true;
					}
				}
				default -> {
					return false;
				}
			}
		}
		return false;
	}

	private static boolean OvenValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "weight", "capacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return true;
					}
				}
				case "width", "height" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Float")){
						return true;
					}
				}
				default -> {
					return false;
				}
			}
		}
		return false;
	}

	private static boolean RefrigeratorValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "weight", "freezerCapacity", "overallCapacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return true;
					}
				}
				case "width", "height" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Float")){
						return true;
					}
				}
				default -> {
					return false;
				}
			}
		}
		return false;
	}

	private static boolean SpeakersValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "numberOfSpeakers", "cordLength" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return true;
					}
				}
				default -> {
					return false;
				}
			}
		}
		return false;
	}

	private static boolean TabletPCValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "batteryCapacity", "displayInches", "memoryROM", "flashMemoryCapacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return true;
					}
				}
				case "color" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("String")){
						return true;
					}
				}
				default -> {
					return false;
				}
			}
		}
		return false;
	}

	private static boolean VacuumCleanerValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "motorSpeedRegulation", "cleaningWidth" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return true;
					}
				}
				default -> {
					return false;
				}
			}
		}
		return false;
	}





}