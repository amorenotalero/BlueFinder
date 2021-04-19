package es.loyola.iitv.pdm.classes;

import java.util.Date;

public class AnnouncementResponseImpl implements AnnouncementResponse{

	private String content;
	private Date sendDate;
	private boolean visible;
	private User user;
	private Announcement announcement;
	public AnnouncementResponseImpl(String content, Date sendDate, boolean visible, User user, Announcement announcement) {
		super();
		this.content = content;
		this.sendDate = sendDate;
		this.visible = visible;
		this.user = user;
		this.announcement = announcement;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean getVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public User getUser() {
		return user;
	}
	
	public Announcement getAnnouncement() {
		return announcement;
	}
	
	
	
	
}
