package com.xyuae.reservations.landon.data.repository;

import com.xyuae.reservations.landon.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Xiaojun YU on 2017-09-25.
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
    Room findByNumber(String number);
}
