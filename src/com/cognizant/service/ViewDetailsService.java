package com.cognizant.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.ViewDetailsDAO;
import com.cognizant.entity.TrainerSchedule;

@Component
public class ViewDetailsService {

	@Autowired
	ViewDetailsDAO dao;
	
	public List<TrainerSchedule> retrieveDetails(String date) throws ParseException{
		List<TrainerSchedule> list =dao.retrieveDetails(date);
		return list;
	}
}
