package es.loyola.iitv.pdm.classes;

import java.util.Date;
import java.util.List;

public interface Announcement {

	String getTitle();
	
	void setTitle(String title);

	Theme getTheme();
	
	void setTheme(Theme theme);
	
	String getDescription();
	
	void setDescription(String description);
	
	Date getCreationDate();
	
	Date getCloseDate();
	
	User getUser();
	
	List<AnnouncementResponse> getResponsesList();
	
	void addResponse(AnnouncementResponse announcementResponse);
	
	
}
