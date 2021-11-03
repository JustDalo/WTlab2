package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
    private int powerConsumption;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public int getPowerConsumption() {
        return powerConsumption;
    }
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }
    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }
    public int getCleaningWidth() {
        return cleaningWidth;
    }
    public void setCleaningWidth() {
        this.cleaningWidth = cleaningWidth;
    }
}
