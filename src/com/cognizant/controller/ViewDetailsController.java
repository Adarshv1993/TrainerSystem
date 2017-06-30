package com.cognizant.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.entity.TrainerSchedule;
import com.cognizant.service.ViewDetailsService;

@Controller
public class ViewDetailsController {
	
	@Autowired
	ViewDetailsService service;
	
	@RequestMapping(value="/viewDetails",method=RequestMethod.GET)
	public String retrieve(Model model){
		//model.addAttribute("date",date);
		return "viewDetails";
		}
	
	@RequestMapping(value="/viewDetails1",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<TrainerSchedule> retrieveDetails(@RequestParam("date") String date) throws ParseException{
		/*List<TrainerSchedule> list=service.retrieveDetails(date);
		System.out.println("controller :"+list);
		System.out.println("In Controller view"+date);
		return list;*/
	
		List<TrainerSchedule> t = new ArrayList<TrainerSchedule>();

        List<TrainerSchedule> t1 = new ArrayList<TrainerSchedule>();

        t = service.retrieveDetails(date);

        for(int i=0;i<t.size();i++)

        {

        	TrainerSchedule trainerSchedule1 = t.get(i);

                trainerSchedule1.getTrainer().setSchedule(null);

                t1.add(trainerSchedule1);

        }

        System.out.println("Controller*******************" + t);

        return t;
	}
}
