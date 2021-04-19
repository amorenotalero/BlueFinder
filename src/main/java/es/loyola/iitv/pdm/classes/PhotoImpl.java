package es.loyola.iitv.pdm.classes;

public class PhotoImpl implements Photo{
	private String url;

	public PhotoImpl(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
 
}
