package com.example.reservation.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservation.domain.Reservation;
import com.example.reservation.repository.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;

	public List<Reservation> listReservations(){
		List<Reservation> listReservations = reservationRepository.findAll();
		return listReservations;
	}
}
