package es.loyola.iitv.pdm.dao;

import java.util.LinkedList;
import java.util.List;

import es.loyola.iitv.pdm.classes.Campus;
import es.loyola.iitv.pdm.classes.Gender;
import es.loyola.iitv.pdm.classes.Goal;
import es.loyola.iitv.pdm.classes.User;
import es.loyola.iitv.pdm.classes.UserImpl;

public class UserManager {

static List<User> userList = new LinkedList<User>();
	
	public static void createUser() {
		User user1 = new UserImpl("Carlos", "Cuevas Balinas", "ccuevasbalinas@al.uloyola.es", "1234", 22, Gender.MAN, Goal.RELATIONSHIP, Campus.SEVILLA, null);
		User user2 = new UserImpl("Antonio", "Moreno Talero", "amorenotalero@al.uloyola.es", "4321", 22, Gender.MAN, Goal.RELATIONSHIP, Campus.SEVILLA, null);
		userList.add(user1);
		userList.add(user2);
	}
	
	public static List<User> getUsers() {
		return userList;
	}
}
