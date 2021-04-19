package es.loyola.iitv.pdm.dao;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import es.loyola.iitv.pdm.classes.Announcement;
import es.loyola.iitv.pdm.classes.AnouncementImpl;
import es.loyola.iitv.pdm.classes.Theme;
import es.loyola.iitv.pdm.classes.User;




public class AnnouncementManager{
static List<Announcement> announcementList = new LinkedList<Announcement>();
	
	public static void createAnnouncement() {
		Date today = new Date();
		UserManager.createUser();
		User u1 = UserManager.getUsers().get(0);
		User u2 = UserManager.getUsers().get(1);
		Announcement a1 = new AnouncementImpl("Anuncio1", "Descripcion del anuncio 1", Theme.OTHER, today, null, u1);
		Announcement a2 = new AnouncementImpl("Anuncio2", "Descripcion del anuncio 2", Theme.OTHER, today, null, u2);
		announcementList.add(a1);
		announcementList.add(a2);
	}
	
	public static List<Announcement> getAnnouncements() {
		return announcementList;
	}

}
