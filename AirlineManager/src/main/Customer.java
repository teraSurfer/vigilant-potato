package main;
public class Customer {
	private String name;
	private String route;
	
	//getter and setter methods
	
	public String getName() {
		return name;
	}
	public String getRoute() {
		return route;
	}
	//customer constructor
	
	public Customer(String name, String route) {
		super();
		this.name = name;
		this.route = route;
	}
		
}
