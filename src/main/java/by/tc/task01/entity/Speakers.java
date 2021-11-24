package by.tc.task01.entity;

public class Speakers extends Appliance {
    private int powerConsumption;
    private int numberOfSpeakers;
    private int cordLength;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VacuumCleaner {");
        sb.append("cost = ").append(super.getCost());
        sb.append(", powerConsumption = ").append(powerConsumption);
        sb.append(", numberOfSpeakers = ").append(numberOfSpeakers);
        sb.append(", cordLength = ").append(cordLength);
        sb.append('}');
        return sb.toString();
    }

}
