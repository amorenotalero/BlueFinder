package es.loyola.iitv.pdm.classes;

import java.util.Date;

public class LinkImpl implements Link{

	private Date creationDate, activationDate;
	private User user1, user2;
	private boolean status;
	public LinkImpl(Date creationDate, Date activationDate, User user1, User user2, boolean status) {
		super();
		this.creationDate = creationDate;
		this.activationDate = activationDate;
		this.user1 = user1;
		this.user2 = user2;
		this.status = status;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Date getActivationDate() {
		return activationDate;
	}
	public User getUser1() {
		return user1;
	}
	public User getUser2() {
		return user2;
	}
	
	
	
}
