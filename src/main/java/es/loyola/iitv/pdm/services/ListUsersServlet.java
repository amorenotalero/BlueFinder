package es.loyola.iitv.pdm.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.loyola.iitv.pdm.classes.User;
import es.loyola.iitv.pdm.dao.UserManager;



@WebServlet(urlPatterns="/getUsers")
public class ListUsersServlet extends HttpServlet{


	/**
	 * 
	 */
	private static final long serialVersionUID = -6444087815446612894L;

	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) {
		
		resp.setContentType("text/plain");
		resp.setHeader("Cache-Control", "no-cache");
		resp.setHeader("Cache-Control", "no-store");
		PrintWriter writer;
		try {
			writer= resp.getWriter();
			UserManager.createUser();
			for ( User u: UserManager.getUsers()) {
				writer.write(u.toString() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
}
