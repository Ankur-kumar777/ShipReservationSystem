package com.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Schedule {
	@Id
	private Integer sechduleID;
	private LocalDate journeyDate;
	private String time;
	
	
	
	public Integer getSechduleID() {
		return sechduleID;
	}
	public void setSechduleID(Integer sechduleID) {
		this.sechduleID = sechduleID;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Schedule [sechduleID=" + sechduleID + ", journeyDate=" + journeyDate + ", time=" + time + "]";
	}
	
	
	

}
