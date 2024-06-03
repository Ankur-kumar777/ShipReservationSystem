package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.*;
import com.demo.service.RouteService;
import com.demo.service.ScheduleService;
import com.demo.service.ShipService;

@Controller
public class ShipController {

	  @Autowired
	  private ShipService shipService;
	  
	  @Autowired
	  private RouteService routeService;
	  @Autowired
	  ScheduleService scheduleService;
	  @GetMapping("/view-ship")
	  public String getAllShips(Model model) {
		  List<Ship> ships = shipService.findAll();
		  model.addAttribute("ships", ships);
		  System.out.println(ships);
		  return "ViewShips";
	  }
	  
	  @GetMapping("/add-ship")

	  public String showAddShipDetail(Model model) {

	  List<Route> routes = routeService.findAllRoute();
	  List<Schedule> schedule= scheduleService.findAllSchedule();

	  model.addAttribute("routes", routes);
	  model.addAttribute("schedules", schedule);
	  model.addAttribute("ship",new Ship());

	  return "AddShip";

	  }

	  @PostMapping("/add-ship")

	  public String addShip(@ModelAttribute Ship ship, @RequestParam("routeId") int routeId, @RequestParam("sechduleID") String sechduleID) {

	  Route route = routeService.findByRouteId(routeId);
	  Schedule  schedule  =  scheduleService.findScheduleById(sechduleID);

	  ship.setRoute(route);
	  
	  ship.setSchedule(schedule);

	  shipService.saveShip(ship);

	  return "redirect:/view-ship";

	  }

	  @GetMapping("/update-ship/{id}")

	  public String showUpdateDetails(@PathVariable int id, Model model) {

	  Ship ship = shipService.findShipById(id);

	  List<Route> routes = routeService.findAllRoute();

	  model.addAttribute("ship", ship);

	  model.addAttribute("route",routes);

	  return "updateship";

	  }

	  @PostMapping("/update-ship/")

	  public String updateShip(@RequestParam("shipId") String id, @RequestParam("perKmRate") int perKmRate, @RequestParam("shipModel") String shipModel,

	  @RequestParam("reservationCapacity") int reservationCapacity, @RequestParam("capacity") int capacity) {

	  int shipId=Integer.parseInt(id);

	  Ship updateShip = shipService.findShipById(shipId);

	  updateShip.setPerKmRate(perKmRate);

	  updateShip.setShipModel(shipModel);

	  updateShip.setReservationCapacity(reservationCapacity);

	  updateShip.setCapacity(capacity);

	  shipService.updateShip(shipId, updateShip);

	  return "redirect:/view-ship";

	  }

	  @GetMapping("/delete-ship/{id}")

	  public String deleteShip(@PathVariable int id) {

	  shipService.deletebyId(id);

	  return "redirect:/view-ship";

	  }
	  
	   
}
