package test;

import org.junit.Test;

import main.FriendsException;
import main.Person;
import main.PersonInterface;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class ConnectFriendsTest {
	Person[] people = new Person[PersonInterface.MAX_FRIENDS];
	
	@Test
	public void testAddFriends() throws FriendsException{
		people[0] = new Person("a");
		people[1] = new Person("b");
		people[2] = new Person("c");
		people[3] = new Person("d");
		people[4] = new Person("e");
		PersonInterface person = new Person("RealPerson");
		ArrayList<String> al = new ArrayList<>();
		for(Person p: people){
			al.add(p.getName());
		}
		assertEquals(al, person.addFriends(people));
	}
}
