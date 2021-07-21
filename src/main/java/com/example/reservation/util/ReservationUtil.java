package com.example.reservation.util;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.reservation.domain.Reservation;

public class ReservationUtil {
	
	public static List<Reservation> getListReservations(){
		List<Reservation> listReservations = new ArrayList<Reservation>();
		Reservation reservation1 = new Reservation(1,"Pepe",LocalDateTime.now());
		Reservation reservation2 = new Reservation(2,"Juan",LocalDateTime.now());
		Reservation reservation3 = new Reservation(3,"Pedro",LocalDateTime.now());
		Reservation reservation4 = new Reservation(4,"Luis",LocalDateTime.now());
		Reservation reservation5 = new Reservation(5,"David",LocalDateTime.now());
		listReservations.add(reservation1);
		listReservations.add(reservation2);
		listReservations.add(reservation3);
		listReservations.add(reservation4);
		listReservations.add(reservation5);
		return listReservations;
	}

}
