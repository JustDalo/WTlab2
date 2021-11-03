package by.tc.task01.entity;

public class Laptop extends Appliance{
	private float batteryCapacity;
	private int memoryROM;
	private int systemMemory;
	private float CPU;
	private int displayInchs;

	public float getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(float batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public float getCPU() {
		return CPU;
	}

	public void setCPU(float CPU) {
		this.CPU = CPU;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}
}
