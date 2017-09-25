package main;

import java.util.ArrayList;
public class Person implements PersonInterface {
	private String name;
	private ArrayList<Person> friends;
	
	
	public Person(String name, Person[] friends) throws FriendsException {
		super();
		this.name = name;
		this.friends = new ArrayList<>(MAX_FRIENDS);
		addFriends(friends);
	}
	
	public Person(String name){
		super();
		this.name = name;
		this.friends = new ArrayList<>(MAX_FRIENDS);
	}
	
	@Override
	public ArrayList<String> addFriends(Person[] friends) throws FriendsException{
		ArrayList<String> friendNames = new ArrayList<>(MAX_FRIENDS);
		if(friends.length>MAX_FRIENDS) throw new FriendsException("Too many friends exception");
		else if((this.friends.size() + friends.length) > MAX_FRIENDS)throw new FriendsException("Too many friends exception");
		else{
			for(Person friend : friends){
				this.friends.add(friend);
				friendNames.add(friend.getName());
			}
		}
		return friendNames;
	}
	
	public String getName(){
		return this.name;
	}
}
