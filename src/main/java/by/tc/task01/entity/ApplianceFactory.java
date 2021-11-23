package by.tc.task01.entity;

import java.util.ArrayList;

public class ApplianceFactory {
    public Appliance getAppliance(String applianceGroup, ArrayList<String> infoParameters){
        Appliance appliance;
        switch (applianceGroup) {
            case  ("Kettle"):
                appliance = getKettle(infoParameters);
                break;
            default:
                appliance = null;
                break;
        }
        return appliance;
    }

    private Kettle getKettle(ArrayList<String> infoParameters){
        Kettle electricKettleInfo = new Kettle();
        electricKettleInfo.setCost(Integer.parseInt(infoParameters.get(1)));
        electricKettleInfo.setPowerConsumption(Integer.parseInt(infoParameters.get(2)));
        electricKettleInfo.setWeight(Integer.parseInt(infoParameters.get(3)));
        electricKettleInfo.setCapacity(Integer.parseInt(infoParameters.get(4)));
        return electricKettleInfo;
    }
}
