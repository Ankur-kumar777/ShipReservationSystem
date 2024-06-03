package com.demo.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.Booking;
import com.demo.service.BookingService;

@Controller
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/booking")
	public String booking(Model model) {
		List<Booking> booking=bookingService.getallbookings();
		System.out.println(booking);
		model.addAttribute("booking",booking);
		return "Booking";
	}
	
	@GetMapping("/bookingdetails")
	 public List<Booking> viewBooking(Model model){
		List<Booking> booking=bookingService.getallbookings();
		System.out.println(booking);
		model.addAttribute("booking",booking);
		
		return booking;
	}
	
	@GetMapping("/searchedetails")
	public String viewBookingByShipIdAndBookingDate( @RequestParam int shipId  ,@RequestParam LocalDate date ,Model model ){

		List<Booking> booking = bookingService.getBookingByShipIdAndBookingDate(shipId,date);
		model.addAttribute("booking",booking);
		return "Booking";
	}

}
