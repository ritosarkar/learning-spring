package com.org.lil.learning_spring.util;


import com.org.lil.learning_spring.data.guest.GuestRepository;
import com.org.lil.learning_spring.data.reservation.Reservation;
import com.org.lil.learning_spring.data.reservation.ReservationRepository;
import com.org.lil.learning_spring.data.room.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    protected final RoomRepository roomRepository;
    protected final GuestRepository guestRepository;

    protected final ReservationRepository reservationRepository;

    public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
      this.roomRepository.findAll().forEach(System.out::println);
      this.guestRepository.findAll().forEach(System.out::println);
      this.reservationRepository.findAll().forEach(System.out::println);
    }
}
