package by.tc.task01.entity;

public class Kettle extends Appliance {
    private int powerConsumption;
    private int weight;
    private int capacity;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kettle {");
        sb.append("cost = ").append(super.getCost());
        sb.append(", powerConsumption = ").append(powerConsumption);
        sb.append(", weight = ").append(weight);
        sb.append(", capacity = ").append(capacity);
        sb.append('}');
        return sb.toString();
    }
}
