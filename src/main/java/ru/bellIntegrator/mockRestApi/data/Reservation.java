package ru.bellIntegrator.mockRestApi.data;

public class Reservation {
private String hotel;
private String guestName;
private String roomType;
public String getHotel() {
	return hotel;
}
public void setHotel(String hotel) {
	this.hotel = hotel;
}



public String getGuestName() {
	return guestName;
}
public void setGuestName(String guestName) {
	this.guestName = guestName;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public Reservation(String hotel, String guestName, String roomType) {
	this.hotel = hotel;
	this.guestName = guestName;
	this.roomType = roomType;
}


}
