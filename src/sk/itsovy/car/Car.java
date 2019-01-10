package sk.itsovy.car;

import detail.Engine;

public class Car {
	private String brand;
	private String model;
	private int year;
	private double consumption;
	private boolean cvt;
	private Color color;
	private Engine engine;
	
	public Car(){
		this.year=2019;
		this.cvt=false;
		this.consumption=10.0;
	}
	
	public Car(String brand, String model, int year, double consumption, int engineCylinder, int power, int volume, char fuel) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.consumption = consumption;
		engine= new Engine(engineCylinder, power, volume, fuel);
	}
	
	public double calculateRange(double price, double priceLiter) {
		double range;
		range=((price/priceLiter)/this.consumption)*100;
		return range;
	}
	
	public double calculateRange(double price, double priceLiter, double consumption) {
		double range;
		range=((price/priceLiter)/consumption)*100;
		return range;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;  //prve= hore co je nastavene , druhe= co ziska 
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public boolean isCvt() {
		return cvt;
	}

	public void setCvt(boolean cvt) {
		this.cvt = cvt;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void print() {
		System.out.println("Brand: "+this.brand+" Model: "+this.model+" Year: "+this.year);
	}
	
	public void printDetail() {
		print();
		System.out.println("Details: consumption"+this.consumption+"Color: "+color);
		System.out.println("Engine: power"+engine.getPower());
	}
	
	
	
}
