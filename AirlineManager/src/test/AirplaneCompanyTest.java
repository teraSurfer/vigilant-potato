package test;
import org.junit.Test;

import main.AirplaneCompany;
import main.Customer;
import static org.junit.Assert.assertEquals;


public class AirplaneCompanyTest {
	Customer c = new Customer("abc", "hyderabad-mumbai");
	AirplaneCompany ac = new AirplaneCompany();
	String msg = "Starting flight for route: hyderabad-mumbai";
	
	@Test
	public void testStartPlane() throws Exception{
		ac.assignPlane(c.getRoute());
		ac.sellTicket(c, c.getRoute());
		assertEquals(msg, ac.startPlane(c.getRoute()));
	}
}
