package com.cognizant.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TrainerSchedule;
@Component
public class InsertTrainerScheduleDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void insert(TrainerSchedule details) {
		// TODO Auto-generated method stub
		em.persist(details);
	}

}
