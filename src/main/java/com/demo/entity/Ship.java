package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ship {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer shipId;
	@ManyToOne
	@JoinColumn(name="routeId")
	private Route route;
	@ManyToOne
	@JoinColumn(name="sechduleId")
	private Schedule schedule;
	private String shipModel;
	private Integer capacity;
	private Integer reservationCapacity;
	private Integer perKmRate;
	public Integer getShipId() {
		return shipId;
	}
	public void setShipId(Integer shipId) {
		this.shipId = shipId;
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
	public String getShipModel() {
		return shipModel;
	}
	public void setShipModel(String shipModel) {
		this.shipModel = shipModel;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Integer getReservationCapacity() {
		return reservationCapacity;
	}
	public void setReservationCapacity(Integer reservationCapacity) {
		this.reservationCapacity = reservationCapacity;
	}
	public Integer getPerKmRate() {
		return perKmRate;
	}
	public void setPerKmRate(Integer perKmRate) {
		this.perKmRate = perKmRate;
	}
	@Override
	public String toString() {
		return "Ship [shipId=" + shipId + ", route=" + route + ", schedule=" + schedule + ", shipModel=" + shipModel
				+ ", capacity=" + capacity + ", reservationCapacity=" + reservationCapacity + ", perKmRate=" + perKmRate
				+ "]";
	}
	
	
}
	
