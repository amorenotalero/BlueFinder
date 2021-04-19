package es.loyola.iitv.pdm.classes;

import java.util.Date;

public interface Message {

	Date getSendDate();
	
	String getText();
	
	void setText(String text);
	
	Chat getChat();
	
	
}
