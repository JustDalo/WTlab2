package by.tc.task01.entity;

public class Laptop extends Appliance{
	private float batteryCapacity;
	private String operationSystem;
	private int memoryROM;
	private int systemMemory;
	private float cpu;
	private int displayInches;

	public float getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(float batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
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

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Laptop {");
		sb.append("cost = ").append(super.getCost());
		sb.append(", batteryCapacity = ").append(batteryCapacity);
		sb.append(", os = ").append(operationSystem);
		sb.append(", memoryRom = ").append(memoryROM);
		sb.append(", systemMemory = ").append(systemMemory);
		sb.append(", cpu = ").append(cpu);
		sb.append(", displayInches = ").append(displayInches);
		sb.append('}');
		return sb.toString();
	}
}
