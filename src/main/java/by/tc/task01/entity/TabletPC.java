package by.tc.task01.entity;

import java.awt.*;

public class TabletPC extends Appliance{
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public int getDisplayInches() {
        return displayInches;
    }
    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }
    public int getMemoryRom() {
        return memoryRom;
    }
    public void setMemoryROM(int memoryRom) {
        this.memoryRom = memoryRom;
    }
    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }
    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TabletPC {");
        sb.append("cost = ").append(super.getCost());
        sb.append(", batteryCapacity = ").append(batteryCapacity);
        sb.append(", displayInches = ").append(displayInches);
        sb.append(", memoryRom = ").append(memoryRom);
        sb.append(", flashMemoryCapacity = ").append(flashMemoryCapacity);
        sb.append(", color = ").append(color);
        sb.append('}');
        return sb.toString();
    }
}
