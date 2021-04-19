package es.loyola.iitv.pdm.classes;

import java.util.List;

public interface User {
	
	String getName();

	void setName(String name);

	String getSurName();

	void setSurName(String surName);

	int getAge();

	void setAge(int age);

	String getEmail();

	void setEmail(String email);
	
	String getPassword();
	
	void setPassword(String password);
	
	Gender getGender();
	
	void setGender(Gender gender);
	
	Goal getGoal();
	
	void setGoal(Goal goal);
	
	Campus getCampus();
	
	void setCampus(Campus campus);
	
	List<Link> getLinks();
	
	void addLink(Link link);
	
	List<Chat> getChats();
	
	void addChat(Chat chat);
	
	Photo getPhoto();
	
	List<Hobby> getHobbies();

	
	
}
