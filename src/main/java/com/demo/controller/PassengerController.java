package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.entity.Passenger;
import com.demo.service.PassengerService;

@Controller
public class PassengerController {
	
	  @Autowired
	  PassengerService passengerService;
	  
	  @GetMapping("/passengers")
	  public String passenger(Model model) {
		  
		  List<Passenger> passenger=passengerService.getallpassengers();
		  System.out.println(passenger);
		  model.addAttribute("passengers",passenger);
		  return "Passenger";
	  }
	  
	  @GetMapping("/passengerdetails")
	  public List<Passenger> viewPassenger(Model model){
		  List<Passenger> passenger=passengerService.getallpassengers();
		  System.out.println(passenger);
		  model.addAttribute("passengers",passenger);
		  
		  return passenger;
	  }

}
