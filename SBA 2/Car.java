package com.mytask.assessment2;

import java.util.Comparator;

public class Car implements Comparator<Car>{
	
	private String carName;
	private int manufactureYear;
	public Car(String carName, int manufactureYear) {
		super();
		this.carName = carName;
		this.manufactureYear = manufactureYear;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", manufactureYear=" + manufactureYear + "]";
	}
	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
