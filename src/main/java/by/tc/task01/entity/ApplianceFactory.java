package by.tc.task01.entity;

import java.util.ArrayList;

public class ApplianceFactory {
    public Appliance getAppliance(String applianceGroup, ArrayList<String> infoParameters){
        Appliance appliance;
        switch (applianceGroup) {
            case  ("Kettle"):
                appliance = getKettle(infoParameters);
                break;
            case ("Laptop"):
                appliance = getLaptop(infoParameters);
                break;
            case ("Oven"):
                appliance = getOven(infoParameters);
                break;
            case ("Refrigerator"):
                appliance = getRefrigerator(infoParameters);
                break;
            case ("Speakers"):
                appliance = getSpeakers(infoParameters);
                break;
            case ("TabletPC"):
                appliance = getTabletPC(infoParameters);
                break;
            case ("VacuumCleaner"):
                appliance = getVacuumCleaner(infoParameters);
                break;
            default:
                appliance = null;
                break;
        }
        return appliance;
    }

    private Kettle getKettle(ArrayList<String> infoParameters){
        Kettle kettleInfo = new Kettle();
        kettleInfo.setCost(Integer.parseInt(infoParameters.get(1)));
        kettleInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(2)));
        kettleInfo.setWeight(Integer.parseInt(infoParameters.get(3)));
        kettleInfo.setCapacity(Integer.parseInt(infoParameters.get(4)));
        return kettleInfo;
    }

    private Laptop getLaptop(ArrayList<String> infoParameters) {
        Laptop laptopInfo = new Laptop();
        laptopInfo.setCost(Integer.parseInt(infoParameters.get(1)));
        laptopInfo.setBatteryCapacity(Float.parseFloat(infoParameters.get(2)));
        laptopInfo.setOperationSystem(infoParameters.get(3));
        laptopInfo.setMemoryROM(Integer.parseInt(infoParameters.get(4)));
        laptopInfo.setSystemMemory(Integer.parseInt(infoParameters.get(5)));
        laptopInfo.setCpu(Float.parseFloat(infoParameters.get(6)));
        laptopInfo.setDisplayInches(Integer.parseInt(infoParameters.get(7)));
        return laptopInfo;
    }

    private Oven getOven(ArrayList<String> infoParameters) {
        Oven ovenInfo = new Oven();
        ovenInfo.setCost(Integer.parseInt(infoParameters.get(1)));
        ovenInfo.setName(infoParameters.get(2));
        ovenInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(3)));
        ovenInfo.setWeight(Integer.parseInt(infoParameters.get(4)));
        ovenInfo.setCapacity(Integer.parseInt(infoParameters.get(5)));
        ovenInfo.setDepth(Integer.parseInt(infoParameters.get(6)));
        ovenInfo.setHeight(Float.parseFloat(infoParameters.get(7)));
        ovenInfo.setWidth(Float.parseFloat(infoParameters.get(8)));
        return ovenInfo;
    }

    private Refrigerator getRefrigerator(ArrayList<String> infoParameters) {
        Refrigerator refrigeratorInfo = new Refrigerator();
        refrigeratorInfo.setCost(Integer.parseInt(infoParameters.get(1)));
        refrigeratorInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(2)));
        refrigeratorInfo.setWeight(Integer.parseInt(infoParameters.get(3)));
        refrigeratorInfo.setFreezerCapacity(Integer.parseInt(infoParameters.get(4)));
        refrigeratorInfo.setOverallCapacity(Integer.parseInt(infoParameters.get(5)));
        refrigeratorInfo.setHeight(Float.parseFloat(infoParameters.get(6)));
        refrigeratorInfo.setWidth(Float.parseFloat(infoParameters.get(7)));
        return refrigeratorInfo;
    }

    private Speakers getSpeakers(ArrayList<String> infoParameters) {
        Speakers speakersInfo = new Speakers();
        speakersInfo.setCost(Integer.parseInt(infoParameters.get(1)));
        speakersInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(2)));
        speakersInfo.setNumberOfSpeakers(Integer.parseInt(infoParameters.get(3)));
        speakersInfo.setCordLength(Integer.parseInt(infoParameters.get(4)));
        return speakersInfo;
    }

    private TabletPC getTabletPC(ArrayList<String> infoParameters) {
        TabletPC tabletPCInfo = new TabletPC();
        tabletPCInfo.setCost(Integer.parseInt(infoParameters.get(1)));
        tabletPCInfo.setBatteryCapacity(Integer.parseInt(infoParameters.get(2)));
        tabletPCInfo.setDisplayInches(Integer.parseInt(infoParameters.get(3)));
        tabletPCInfo.setMemoryROM(Integer.parseInt(infoParameters.get(4)));
        tabletPCInfo.setFlashMemoryCapacity(Integer.parseInt(infoParameters.get(5)));
        tabletPCInfo.setColor(infoParameters.get(6));
        return tabletPCInfo;
    }

    private VacuumCleaner getVacuumCleaner(ArrayList<String> infoParameters) {
        VacuumCleaner vacuumCleanerInfo = new VacuumCleaner();
        vacuumCleanerInfo.setCost(Integer.parseInt(infoParameters.get(1)));
        vacuumCleanerInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(2)));
        vacuumCleanerInfo.setMotorSpeedRegulation(Integer.parseInt(infoParameters.get(3)));
        vacuumCleanerInfo.setCleaningWidth(Integer.parseInt(infoParameters.get(4)));
        return vacuumCleanerInfo;
    }
}
