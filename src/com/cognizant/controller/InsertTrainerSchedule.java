package com.cognizant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.entity.TrainerDetails;
import com.cognizant.entity.TrainerSchedule;
import com.cognizant.service.TrainerScheduleService;

@Controller
public class InsertTrainerSchedule {
	
	@Autowired
	TrainerScheduleService service;
 
	@RequestMapping(value="/applySchedule" , method=RequestMethod.GET)
	public String insertSchedule(Model model)
	{
		model.addAttribute("trainerDetails",new TrainerDetails());
		model.addAttribute("trainerSchedule",new TrainerSchedule());
		return "insertTrainerSchedule";
	}
	
	@RequestMapping(value="/applySchedule1",method=RequestMethod.POST)
	public String insertSchedule(@ModelAttribute("trainerSchedule") TrainerSchedule schedule)
	{
	
	service.insertTrainerScheduleService(schedule);
	return "success";
	}

}
