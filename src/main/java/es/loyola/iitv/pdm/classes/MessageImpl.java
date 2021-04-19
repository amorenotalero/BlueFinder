package es.loyola.iitv.pdm.classes;

import java.util.Date;

public class MessageImpl implements Message{

	private String text;
	private Date sendDate;
	private Chat chat;
	public MessageImpl(String text, Date sendDate, Chat chat) {
		super();
		this.text = text;
		this.sendDate = sendDate;
		this.chat = chat;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public Chat getChat() {
		return chat;
	}
	
	
	
	
}
