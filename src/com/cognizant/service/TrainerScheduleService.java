package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.InsertTrainerScheduleDAO;
import com.cognizant.entity.TrainerSchedule;

@Component
public class TrainerScheduleService {

	@Autowired
	InsertTrainerScheduleDAO dao;
    
	public void insertTrainerScheduleService(TrainerSchedule sch){
		dao.insert(sch);
	}
}
