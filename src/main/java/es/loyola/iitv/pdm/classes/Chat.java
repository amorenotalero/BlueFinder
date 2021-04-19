package es.loyola.iitv.pdm.classes;

import java.util.Date;
import java.util.List;

public interface Chat {

	Date getCreationDate();
	
	Link getLink();
	
	List<Message> getMessgaes();
	
	void addMessage(Message message);
	
}
