package ru.bellIntegrator.mockRestApi.repositories;

import java.util.Hashtable;
import java.util.Map;

import ru.bellIntegrator.mockRestApi.data.Reservation;


public class ReservationRepository {
	
	static Map<String, Reservation> reservations = new Hashtable<>();
	
	static {
		reservations.put("Сергей Попов",new Reservation("Radisson SLavyanskaya","Сергей Попов","Standard"));
		reservations.put("Николай Иванов",new Reservation("Park Inn Pribaltiyskaya","Николай Иванов","Junior"));
		reservations.put("Петр Холоденко",new Reservation("Sheraton Voronezh","Петр Холоденко","Suite"));
	}
	
	public Reservation reservationByName(String guestName) {
		return reservations.get(guestName);
	}
	
	public Reservation addReservation(Reservation reservation) {
		reservations.put(reservation.getGuestName(), reservation);
		return reservation;
	}
	

	
	
	
	
	

}
