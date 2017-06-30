package test.java;

import static org.junit.Assert.*;

import java.text.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.ViewDetailsDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestRetrieve {
	
	@Autowired
	ViewDetailsDAO dao;
	
	@Test
	public void test() throws ParseException {
		dao.retrieveDetails("1994-12-12");
		assertTrue(true);
	}

}
