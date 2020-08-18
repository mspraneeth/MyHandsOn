package com.mytask.assessment2;

import java.util.List;

public class ShowRoom {
	
	
	private String showRoomName;
	private int showRoomId;
	List<Car> cars;
	public ShowRoom(String showRoomName, int showRoomId, List<Car> cars) {
		super();
		this.showRoomName = showRoomName;
		this.showRoomId = showRoomId;
		this.cars = cars;
	}
	public String getShowRoomName() {
		return showRoomName;
	}
	public void setShowRoomName(String showRoomName) {
		this.showRoomName = showRoomName;
	}
	public int getShowRoomId() {
		return showRoomId;
	}
	public void setShowRoomId(int showRoomId) {
		this.showRoomId = showRoomId;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "ShowRoom [showRoomName=" + showRoomName + ", showRoomId=" + showRoomId + ", cars=" + cars + "]";
	}
	
	

}
