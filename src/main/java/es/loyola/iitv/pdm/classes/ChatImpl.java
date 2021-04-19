package es.loyola.iitv.pdm.classes;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ChatImpl implements Chat{

	private Date creationDate;
	private Link link;
	private List<Message> listMessage;
	public ChatImpl(Date creationDate, Link link) {
		super();
		this.creationDate = creationDate;
		this.link = link;
		this.listMessage = new LinkedList<Message>();
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Link getLink() {
		return link;
	}
	
	public List<Message> getMessgaes() {
		return listMessage;
	}
	@Override
	public void addMessage(Message message) {
		this.listMessage.add(message);
		
	}
	
	
}
