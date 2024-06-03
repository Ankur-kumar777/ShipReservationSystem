package com.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {

	@Id
	private Integer bookingId;
	@ManyToOne
	@JoinColumn(name="passengerId")
	private Passenger passenger;
	@ManyToOne
	@JoinColumn(name="routeId")
	private Route route;
	@ManyToOne
	@JoinColumn(name="sechduleId")
	private Schedule schedule;
	
	private Integer ratetopay;
	private LocalDate dateOfBooking;
	private Integer ShipId;
	
	
	
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Integer getRatetopay() {
		return ratetopay;
	}
	public void setRatetopay(Integer ratetopay) {
		this.ratetopay = ratetopay;
	}
	
	public LocalDate getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(LocalDate dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public Integer getShipId() {
		return ShipId;
	}
	public void setShipId(Integer shipId) {
		ShipId = shipId;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", passenger=" + passenger + ", route=" + route + ", schedule="
				+ schedule + ", ratetopay=" + ratetopay + ", dateOfBooking=" + dateOfBooking + ", ShipId=" + ShipId
				+ "]";
	}
	
	
	

	
	
	
	
}
	
	
	
	

