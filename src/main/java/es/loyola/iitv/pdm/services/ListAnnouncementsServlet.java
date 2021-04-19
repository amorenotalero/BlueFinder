package es.loyola.iitv.pdm.services;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.loyola.iitv.pdm.classes.Announcement;
import es.loyola.iitv.pdm.dao.AnnouncementManager;


public class ListAnnouncementsServlet {

	
	
	@WebServlet(urlPatterns="/getAnnouncements")
	public class ListUsersServlet extends HttpServlet{


		

		/**
		 * 
		 */
		private static final long serialVersionUID = 4562698282804282202L;

		protected void doGet(HttpServletRequest req,
				HttpServletResponse resp) {
			
			resp.setContentType("text/plain");
			resp.setHeader("Cache-Control", "no-cache");
			resp.setHeader("Cache-Control", "no-store");
			PrintWriter writer;
			try {
				writer= resp.getWriter();
				AnnouncementManager.createAnnouncement();
				for ( Announcement a: AnnouncementManager.getAnnouncements()) {
					writer.write(a.toString() + "\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
			
	}
}
