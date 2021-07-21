package com.example.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.ReservationService;

@RestController
public class ReservationControlller {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/reservations")
	public List<Reservation> getReervations(){
		List<Reservation> response = reservationService.listReservations();
		return response;
	}

}
