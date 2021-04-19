package es.loyola.iitv.pdm.classes;

import java.util.Date;

public interface AnnouncementResponse {

	String getContent();
	
	void setContent(String content);
	
	Date getSendDate();
	
	boolean getVisible();
	
	void setVisible(boolean visble);
	
	User getUser();
	
	Announcement getAnnouncement();
	
	
	
	
}
