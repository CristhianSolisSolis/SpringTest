package com.example.reservation;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.reservation.domain.Reservation;
import com.example.reservation.repository.ReservationRepository;
import com.example.reservation.util.ReservationUtil;

@SpringBootApplication
public class ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init (ReservationRepository reservationRepository){
        return args -> {
            List<Reservation> reservations = ReservationUtil.getListReservations();
            reservations.forEach(reservation -> reservationRepository.save(new Reservation(reservation.getId(), reservation.getName(), reservation.getTime())));
        };
    }

}
