package test;
import org.junit.Test;
import main.RouteException;

import main.AirplaneCompany;
import main.Customer;
import static org.junit.Assert.assertEquals;


public class AirplaneCompanyTest {
	Customer c = new Customer("abc", "hyderabad-mumbai");
	
	String msg = "Starting flight for route: hyderabad-mumbai";
	
	@Test
	public void testStartPlane() throws RouteException{
		AirplaneCompany ac = new AirplaneCompany(c, c.getRoute());
		assertEquals(msg, ac.startPlane(c.getRoute()));
	}
}
