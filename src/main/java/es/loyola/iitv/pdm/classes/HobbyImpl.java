package es.loyola.iitv.pdm.classes;

public class HobbyImpl implements Hobby{
	private String hobbyName;

	public HobbyImpl(String hobbyName) {
		super();
		this.hobbyName = hobbyName;
	}


	@Override
	public String getHobbyName() {
		return hobbyName;
	}

	@Override
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
		
	}
	
	
}
