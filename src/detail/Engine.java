package detail;

public class Engine {
	private int engineCylinder;
	private int power;
	private int volume;
	private char fuel;
	
	public Engine(int engineCylinder, int power, int volume, char fuel) {
		this.engineCylinder = engineCylinder;
		this.power = power;
		this.volume = volume;
		this.fuel = fuel;
	}

	public int getEngineCylinder() {
		return engineCylinder;
	}

	public int getPower() {
		return power;
	}

	public int getVolume() {
		return volume;
	}

	public char getFuel() {
		return fuel;
	}
	
	
	
	
}
