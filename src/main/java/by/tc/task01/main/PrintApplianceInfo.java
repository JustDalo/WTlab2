package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		if (appliances.isEmpty()) {
			System.out.println("There is no such appliance");
		}
		for (Appliance appliance : appliances) {
			System.out.println(appliance.toString());
		}
	}
}
