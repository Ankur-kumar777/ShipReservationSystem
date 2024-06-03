package com.demo.ShipRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Integer>{
      Route getRouteByRouteId(String routeId);
}
