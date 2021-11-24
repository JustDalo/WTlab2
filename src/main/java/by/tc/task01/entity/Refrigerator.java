package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	private int powerConsumption;
	private int weight;
    private int freezerCapacity;
    private int overallCapacity;
    private float height;
    private float width;

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

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Refrigerator {");
        sb.append("cost = ").append(super.getCost());
        sb.append(", powerConsumption = ").append(powerConsumption);
        sb.append(", weight = ").append(weight);
        sb.append(", freezerCapacity = ").append(freezerCapacity);
        sb.append(", overallCapacity = ").append(overallCapacity);
        sb.append(", height = ").append(height);
        sb.append(", width = ").append(width);
        sb.append('}');
        return sb.toString();
    }

}
