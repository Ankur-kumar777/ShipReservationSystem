package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ShipRepository.ShipRepository;
import com.demo.entity.Route;
import com.demo.entity.Ship;
@Service
public class ShipService {
    @Autowired
	private ShipRepository shipRepository;
	
	public List <Ship> findAll(){
		return shipRepository.findAll();
	}
	
	public Ship findShipById(int id) {
		return shipRepository.findById(id).orElseThrow();
	}
	
	public Ship saveShip(Ship ship) {
		Ship ship1=new Ship();
		ship1.setCapacity(ship.getCapacity());
		ship1.setPerKmRate(ship.getPerKmRate());
		ship1.setReservationCapacity(ship.getReservationCapacity());
		ship1.setRoute(ship.getRoute());
		ship1.setSchedule(ship.getSchedule());
		ship1.setShipModel(ship.getShipModel());
		return shipRepository.save(ship1);
	}
	
	public Ship updateShip(int id,Ship ship) {
		 Ship updateShip = shipRepository.findById(id).orElse(null);
		 updateShip.setRoute(ship.getRoute());
		 updateShip.setCapacity(ship.getCapacity());
		 updateShip.setReservationCapacity(ship.getReservationCapacity());
		 updateShip.setShipModel(ship.getShipModel());
		 updateShip.setPerKmRate(ship.getPerKmRate());
		 return shipRepository.save(updateShip);
	}
	
	public void deletebyId(int id) {
		shipRepository.deleteById(id);
		
	}
	
}
