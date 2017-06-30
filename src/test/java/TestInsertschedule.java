package test.java;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.dao.InsertTrainerScheduleDAO;
import com.cognizant.entity.TrainerDetails;
import com.cognizant.entity.TrainerSchedule;

public class TestInsertschedule {
	@Autowired
	InsertTrainerScheduleDAO daoS;
	
	
	/*@Test
	public void testInsertSchedule(){
		TrainerDetails trainer=new TrainerDetails(1l,"abhijeet","bfs","gcoea");
		//TrainerSchedule details= new TrainerSchedule(new Date(),2,2l,trainer);
	
		daoS.insert(details);
		assertTrue(true);
		
	}
*/
}
