package main;

import java.util.ArrayList;

public interface PersonInterface {
	public static final int MAX_FRIENDS = 5;
	public ArrayList<String> addFriends(Person[] friends) throws FriendsException;
}
