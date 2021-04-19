package es.loyola.iitv.pdm.classes;

import java.util.Date;

public interface Link {
	
	Date getCreationDate();
	
	Date getActivationDate();
	
	boolean getStatus();
	
	void setStatus(boolean status);
	
	User getUser1();
	
	User getUser2();
	
}