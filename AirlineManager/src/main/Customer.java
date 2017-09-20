package main;
public class Customer {
	private String name;
	private String route;
	
	//getter and setter methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	
	//customer constructor
	
	public Customer(String name, String route) {
		super();
		this.name = name;
		this.route = route;
	}
		
}
