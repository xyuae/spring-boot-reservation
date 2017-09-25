package com.xyuae.reservations.landon.business.service;

import com.xyuae.reservations.landon.business.domain.RoomReservation;
import com.xyuae.reservations.landon.data.entity.Guest;
import com.xyuae.reservations.landon.data.entity.Reservation;
import com.xyuae.reservations.landon.data.entity.Room;
import com.xyuae.reservations.landon.data.repository.GuestRepository;
import com.xyuae.reservations.landon.data.repository.ReservationRepository;
import com.xyuae.reservations.landon.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Xiaojun YU on 2017-09-25.
 */
@Service
public class ReservationService {
    private RoomRepository roomRepository;
    private GuestRepository guestRepository;
    private ReservationRepository reservationRepository;
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }



    public List<RoomReservation> getRoomReservationForDate(String dateString) {
        Date date = this.createDateFromDateString(dateString);
        Iterable<Room> rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        rooms.forEach(room->{
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getNumber());
            roomReservationMap.put(room.getId(), roomReservation);
        }); // rooms.forEach
        Iterable<Reservation> reservations = this.reservationRepository.findByDate(new java.sql.Date(date.getTime()));
        if(null!=reservations) {
            reservations.forEach(reservation -> {
                Guest guest = this.guestRepository.findOne(reservation.getGuestId());
                if(null!=guest){
                    RoomReservation roomReservation = roomReservationMap.get(reservation.getId());
                    roomReservation.setDate(date);
                    roomReservation.setFirstName(guest.getFirstName());
                    roomReservation.setLastName(guest.getLastName());
                    roomReservation.setGuestId(guest.getId());
                }
            }); // reservations.forEach
        }   // if(null!=reservations)
        List<RoomReservation> roomReservations = new ArrayList<>();
        for(Long roomId: roomReservationMap.keySet()) {
            roomReservations.add(roomReservationMap.get(roomId));
        }   // for (Long roomId: roomReservationMap.keySet())
        return roomReservations;
    }   // List<RoomReservation> getRoomReservationForDate

    private Date createDateFromDateString(String dateString) {
        Date date = null;
        if(null!=dateString) {
            try{
                date = DATE_FORMAT.parse(dateString);
            } catch (ParseException e) {
                date=new Date();
            }
        } else {
            date = new Date();
        }
        return date;
    }
}
