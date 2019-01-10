package main;

import sk.itsovy.car.Car;
import sk.itsovy.car.Color;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar= new Car();
		myCar.setBrand("Skoda");
		myCar.setModel("Fabia");
		myCar.setConsumption(5.5);
		myCar.setYear(2001);
		myCar.setColor(Color.SILVER);
		myCar.print();
		
		Car superCar= new Car("Fiat","Fiatik",2018,5.0,4,1596,132,'P');
		superCar.printDetail();
		
		System.out.println(myCar.calculateRange(40, 1.50, 7));
	}

}
