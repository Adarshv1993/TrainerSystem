package com.cognizant.dao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TrainerSchedule;

@Component
public class ViewDetailsDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public List<TrainerSchedule> retrieveDetails(String date) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(date);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DATE, 7);  // number of days to add
		String endDate = sdf.format(c.getTime());
		System.out.println("this is end date"+endDate);
		
		Query query=em.createQuery("from TrainerSchedule t where t.startDate between ? and ?");
		query.setParameter(1,java.sql.Date.valueOf(date));
		query.setParameter(2,java.sql.Date.valueOf(endDate));
		List<TrainerSchedule> list =query.getResultList();
		System.out.println("list"+list.get(0).toString());
		System.out.println("trainer"+list.get(0).getTrainer().toString());
		
		System.out.println("List is Coming"+list.toString());
		return list;
	}
}
