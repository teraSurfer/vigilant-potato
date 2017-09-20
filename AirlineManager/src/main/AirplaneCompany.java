package main;
import java.util.*;

public class AirplaneCompany {
	
	private HashMap<String, ArrayList<Customer>> airplanes;
	
	public void sellTicket(Customer c, String route)throws Exception{
		if(airplanes.containsKey(route)){
		ArrayList<Customer> al = airplanes.get(route);
		al.add(c);
		}else throw new Exception("No Such Route Exists...");
	}
	
	public void assignPlane(String route)throws Exception{
		if(!airplanes.containsKey(route)){
			ArrayList<Customer> al = new ArrayList<>();
			airplanes.put(route, al);
		}else throw new Exception("Route already exists...");
	}
	
	public String startPlane(String route) throws Exception{
		if(airplanes.containsKey(route)){
			String msg = "Starting flight for route: ";
			return msg+route;
		}
		else throw new Exception("No such route exists...");
	}
	
	public AirplaneCompany(){
		airplanes = new HashMap<>();
	}
}
