package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ShipRepository.RouteRepository;
import com.demo.entity.Route;

@Service
public class RouteService {
@Autowired
private RouteRepository routeRepository;
public List <Route> findAllRoute(){
	return routeRepository.findAll();
	}
public Route findByRouteId(int routeId) {
	Route route = routeRepository.findById(routeId).orElseThrow();
	return route;
	}
public Route saveRoute(Route route) {
	return routeRepository.save(route);
	}
	}


