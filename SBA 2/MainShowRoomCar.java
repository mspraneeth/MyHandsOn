package com.mytask.assessment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class MainShowRoomCar {
	
	Map<String, List<Car>> carstore;
	
	public void displayCarsByShowRoomName(String showRoomName)
	{
	List<Car> cars=carstore.get(showRoomName);

	for(Car car:cars){
	System.out.println(car);
	}

	}
	
	
	public void displayCarDetailsByShowRoomAndSort(String showRoomName)
	{
		List<Car> cars=carstore.get(showRoomName);
		System.out.println("-----------Sort the car based on showroom and year---------------");
		Collections.sort(cars, new SortYear());
		
		for(Car car:cars)
		{
			System.out.println(car);
		}
		

	}


	public static void main(String[] args) {
		
		Car car1=new Car("Grand i10", 2016);
		Car car2=new Car("Elite i20", 2018);
		Car car3=new Car("Santro", 2016);
		Car car4=new Car("Verna", 2019);
		Car car5=new Car("Creta", 2017);
		
		List<Car> cars=new ArrayList<Car>();
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		
		
		ShowRoom showRoom =new ShowRoom("Hyundai", 121, cars);
		
		
		Car car6=new Car("Nexon", 2019);
		Car car7=new Car("Tigor", 2016);
		Car car8=new Car("Hexa", 2018);
		Car car9=new Car("Harrier", 2020);
		Car car10=new Car("Tiago", 2016);
		
		List<Car> cars1=new ArrayList<Car>();
		
		cars1.add(car6);
		cars1.add(car7);
		cars1.add(car8);
		cars1.add(car9);
		cars1.add(car10);
		
		ShowRoom showRoom2=new ShowRoom("Tata",131, cars1);
		
		MainShowRoomCar mainShowRoomCar =new MainShowRoomCar();
		mainShowRoomCar.carstore=new HashMap<String,List<Car>>();
		mainShowRoomCar.carstore.put(showRoom.getShowRoomName(),showRoom.getCars());
		mainShowRoomCar.carstore.put(showRoom2.getShowRoomName(),showRoom2.getCars());
		
		
		System.out.println("---------sort by showroom --------");
		
		mainShowRoomCar.displayCarsByShowRoomName("Tata");
		
		
		
		System.out.println("---------sort by car name---------");
		
		Collections.sort(cars, new SortCarName());
		
		for(Car car:cars)
		{
			System.out.println(car);
		}
		
		System.out.println("----------sort by year-----------");
		
		Collections.sort(cars1, new SortYear());
		
		for(Car car:cars1)
		{
			System.out.println(car);
		}
		
		mainShowRoomCar.displayCarDetailsByShowRoomAndSort("Hyundai");
		
	}

}
