package es.loyola.iitv.pdm.classes;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AnouncementImpl implements Announcement{

	private String title, description;
	private Theme theme;
	private Date creationDate, closeDate;
	private User user;
	private List<AnnouncementResponse> responsesList;
	public AnouncementImpl(String title, String description, Theme theme, Date creationDate, Date closeDate, User user) {
		super();
		this.title = title;
		this.description = description;
		this.theme = theme;
		this.creationDate = creationDate;
		this.closeDate = closeDate;
		this.user = user;
		this.responsesList = new LinkedList<>();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	
	public User getUser() {
		return user;
	}
	public List<AnnouncementResponse> getResponsesList() {
		return responsesList;
	}
	public void addResponse(AnnouncementResponse announcementResponse) {
		this.responsesList.add(announcementResponse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnouncementImpl other = (AnouncementImpl) obj;
		if (closeDate == null) {
			if (other.closeDate != null)
				return false;
		} else if (!closeDate.equals(other.closeDate))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (responsesList == null) {
			if (other.responsesList != null)
				return false;
		} else if (!responsesList.equals(other.responsesList))
			return false;
		if (theme != other.theme)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AnouncementImpl [title=" + title + ", description=" + description + ", theme=" + theme
				+ ", creationDate=" + creationDate + ", closeDate=" + closeDate + ", user=" + user + ", responsesList="
				+ responsesList + "]";
	}
	
	
	
	
}
