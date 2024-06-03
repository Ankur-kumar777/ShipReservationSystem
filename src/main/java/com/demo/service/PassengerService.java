package com.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ShipRepository.PassengerRepository;
import com.demo.entity.Passenger;
import com.demo.entity.*;

@Service
public class PassengerService {
    @Autowired
 PassengerRepository passengerrepo;
 public void save (Passenger passenger) {
  passengerrepo.save(passenger);
  }

  public List <Passenger> getallpassengers(){

  List<Passenger> passenger = (List<Passenger>) passengerrepo.findAll();
 return passenger;
 }

 }