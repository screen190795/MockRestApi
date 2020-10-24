package ru.bellIntegrator.mockRestApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.bellIntegrator.mockRestApi.data.Reservation;
import ru.bellIntegrator.mockRestApi.repositories.ReservationRepository;

@RestController
public class Controller {
	ReservationRepository rep = new ReservationRepository();
	
	@GetMapping("/reservation")
	public Reservation getRes(@RequestParam(value="guestName", required=true) String guestName) {
		return rep.reservationByName(guestName);
		
	}
	
	@PostMapping("/reservation")
	public Reservation resUpdate(
			@RequestParam(value="hotel", required=true) String hotel, 
			@RequestParam(value="guestName", required=true)String guestName,
			@RequestParam(value="roomType", required=true)String roomType) {
		Reservation res = rep.reservationByName(guestName);
		if(res!=null) {
			res.setHotel(hotel);
			res.setRoomType(roomType);
			return res;
		}
		else return rep.addReservation(new Reservation(hotel,guestName,roomType));
		
	}

}
