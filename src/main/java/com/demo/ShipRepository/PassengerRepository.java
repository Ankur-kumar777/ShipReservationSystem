package com.demo.ShipRepository;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Admin;
import com.demo.entity.Passenger;

public interface PassengerRepository  extends CrudRepository<Passenger,Integer>{
			Admin getPassengerByPassengerId(String passengerId);
}
