package by.tc.task01.entity;

public class VacuumCleaner extends Appliance {
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

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VacuumCleaner {");
        sb.append("cost = ").append(super.getCost());
        sb.append(", powerConsumption = ").append(powerConsumption);
        sb.append(", motorSpeedRegulation = ").append(motorSpeedRegulation);
        sb.append(", cleaningWidth = ").append(cleaningWidth);
        sb.append('}');
        return sb.toString();
    }

}
