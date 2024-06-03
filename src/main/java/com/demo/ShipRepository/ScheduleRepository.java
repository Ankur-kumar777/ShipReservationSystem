package com.demo.ShipRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer>{

}
