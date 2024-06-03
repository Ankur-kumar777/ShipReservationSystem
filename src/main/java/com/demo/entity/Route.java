package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Route {
	@Id
	private Integer routeId;
	private String source;
	private String destination;
	private Integer noOfKms;
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getNoOfKms() {
		return noOfKms;
	}
	public void setNoOfKms(Integer noOfKms) {
		this.noOfKms = noOfKms;
	}
	
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + ", noOfKms="
				+ noOfKms + "]";
	}


}
