package com.xyuae.services.room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Xiaojun YU on 2017-09-26.
 */
@Repository // annotad with repository
public interface RoomRepository extends CrudRepository<Room, Long>{ // template arguments <Room, Long> where Long is the id field
    Room findByRoomNumber(String roomNumber);
}
