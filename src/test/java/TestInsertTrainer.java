package test.java;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.InsertTrainerDetailsDAO;
import com.cognizant.dao.InsertTrainerScheduleDAO;
import com.cognizant.entity.TrainerDetails;
import com.cognizant.entity.TrainerSchedule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestInsertTrainer {
	@Autowired
	InsertTrainerDetailsDAO dao;
	
	
	@Test
	public void testInsert(){
		TrainerSchedule sch=new TrainerSchedule(new Date(),2,2l);
		TrainerSchedule sch1=new TrainerSchedule(new Date(),3,3l);
		List<TrainerSchedule> lst=new ArrayList<TrainerSchedule>();
		lst.add(sch);
		lst.add(sch1);
		
		TrainerDetails details= new TrainerDetails(4l,"abhijeet","bfs","gcoea",lst);
		sch.setTrainer(details);
		sch1.setTrainer(details);
		//TrainerDetails details1= new TrainerDetails(2l,"adarsh","bfs","ietdavv");
		dao.insert(details);
		assertTrue(true);
		
	}
	
	
	
	

}
