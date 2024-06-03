package com.demo.ShipRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Ship;

	public interface ShipRepository extends JpaRepository<Ship, Integer>{
	      Ship getShipByshipId(String shipId);
	      
}
	
