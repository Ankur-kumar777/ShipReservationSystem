package com.demo.ShipRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

     Booking getBookingByBookingId(String BookingId);
     
    @Query("select booking from Booking booking where booking.ShipId = :ShipId and booking.dateOfBooking =:dateOfBooking")
	List<Booking> getBookingByShipIdAndBookingDate( int ShipId, LocalDate dateOfBooking);
}