package com.demo.service;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ShipRepository.BookingRepository;
import com.demo.entity.Booking;

import jakarta.transaction.Transactional;


@Service
@Transactional


public class BookingService {
 @Autowired
BookingRepository bookingrepo;

public void save(Booking booking) {
bookingrepo.save(booking);
}
public List<Booking> getallbookings(){
	List<Booking> booking =(List<Booking>) bookingrepo.findAll();
	return booking;
	}
public List<Booking> getBookingByShipIdAndBookingDate(int shipId, LocalDate date) {
	// TODO Auto-generated method stub
	List<Booking> booking =(List<Booking>) bookingrepo.getBookingByShipIdAndBookingDate(shipId,date);
	return booking;
}

}
