package com.xyuae.reservations.landon.data.repository;

import com.xyuae.reservations.landon.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}