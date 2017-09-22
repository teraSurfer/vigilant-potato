package main;
import java.util.*;

public class AirplaneCompany {
	
	private HashMap<String, ArrayList<Customer>> airplanes;
	
	public void sellTicket(Customer c, String route)throws Exception{
		if(airplanes.containsKey(route)){
		ArrayList<Customer> al = airplanes.get(route);
		al.add(c);
		}else throw new RouteException("No Such Route Exists...");
	}
	
	public void assignPlane(String route)throws Exception{
		if(!airplanes.containsKey(route)){
			ArrayList<Customer> al = new ArrayList<>();
			airplanes.put(route, al);
		}else throw new RouteException("Route already exists...");
	}
	
	public String startPlane(String route) throws Exception{
		if(airplanes.containsKey(route)){
			String msg = "Starting flight for route: ";
			return msg+route;
		}
		else throw new RouteException("No such route exists...");
	}
	
	public AirplaneCompany(Customer c, String route) throws RouteException{
		airplanes = new HashMap<>();
		sellTicket(c, route);
		
	}
}
