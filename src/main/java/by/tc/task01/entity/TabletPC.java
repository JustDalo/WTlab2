package by.tc.task01.entity;

import java.awt.*;

public class TabletPC extends Appliance{
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private Color color;

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
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
