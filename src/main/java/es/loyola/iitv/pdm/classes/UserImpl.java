package es.loyola.iitv.pdm.classes;

import java.util.LinkedList;
import java.util.List;

public class UserImpl implements User{

	private String name, surName, email, password;
	private int age;
	private Gender gender;
	private Goal goal;
	private Campus campus;
	private List<Link> listLink;
	private List<Chat> listChat;
	private Photo photo;
	private List<Hobby> hobbies;
	
	
	
	public UserImpl(String name, String surName, String email, String password, int age, Gender gender, Goal goal,
			Campus campus, Photo photo) {
		super();
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.goal = goal;
		this.campus = campus;
		this.listLink = new LinkedList<Link>();
		this.listChat = new LinkedList<Chat>();
		this.photo = photo;
		this.hobbies = new LinkedList<Hobby>();
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public Goal getGoal() {
		return goal;
	}



	public void setGoal(Goal goal) {
		this.goal = goal;
	}



	public Campus getCampus() {
		return campus;
	}



	public void setCampus(Campus campus) {
		this.campus = campus;
	}



	public List<Link> getLinks() {
		return listLink;
	}



	@Override
	public void addLink(Link link) {
		this.listLink.add(link);
	}



	@Override
	public List<Chat> getChats() {
		return listChat;
	}



	@Override
	public void addChat(Chat chat) {
		this.listChat.add(chat);
	}



	@Override
	public Photo getPhoto() {
		return photo;
	}



	@Override
	public List<Hobby> getHobbies() {
		return hobbies;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((campus == null) ? 0 : campus.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((goal == null) ? 0 : goal.hashCode());
		result = prime * result + ((hobbies == null) ? 0 : hobbies.hashCode());
		result = prime * result + ((listChat == null) ? 0 : listChat.hashCode());
		result = prime * result + ((listLink == null) ? 0 : listLink.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserImpl other = (UserImpl) obj;
		if (age != other.age)
			return false;
		if (campus != other.campus)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (goal != other.goal)
			return false;
		if (hobbies == null) {
			if (other.hobbies != null)
				return false;
		} else if (!hobbies.equals(other.hobbies))
			return false;
		if (listChat == null) {
			if (other.listChat != null)
				return false;
		} else if (!listChat.equals(other.listChat))
			return false;
		if (listLink == null) {
			if (other.listLink != null)
				return false;
		} else if (!listLink.equals(other.listLink))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "UserImpl [name=" + name + ", surName=" + surName + ", email=" + email + ", password=" + password
				+ ", age=" + age + ", gender=" + gender + ", goal=" + goal + ", campus=" + campus + ", listLink="
				+ listLink + ", listChat=" + listChat + ", photo=" + photo + ", hobbies=" + hobbies + "]";
	}
	




	





	
	

}
