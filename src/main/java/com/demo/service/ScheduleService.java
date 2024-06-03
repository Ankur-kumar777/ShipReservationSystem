package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ShipRepository.ScheduleRepository;
import com.demo.entity.Schedule;

@Service
public class ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	public List<Schedule> findAllSchedule(){
		return scheduleRepository.findAll();
	}
	
	public Schedule findScheduleById(String sechduleID) {
		int id=Integer.parseInt(sechduleID);
		 Schedule schedule =scheduleRepository.findById(id).orElseThrow();
		 return schedule;
	}
	
	public Schedule saveSchedule(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

}
