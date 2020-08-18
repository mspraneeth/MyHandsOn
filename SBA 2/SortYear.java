package com.mytask.assessment2;

import java.util.Comparator;

public class SortYear implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.getManufactureYear()-o2.getManufactureYear();
	}

}
