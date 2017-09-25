package com.xyuae.reservations.landon.data.repository;

import com.xyuae.reservations.landon.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Xiaojun YU on 2017-09-25.
 */
public interface ReservationRepository extends CrudRepository<Reservation, Long>{
    List<Reservation> findByDate(Date date);
}
