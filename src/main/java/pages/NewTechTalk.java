package pages;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbutils.Dao;
import pojo.Event;


public class NewTechTalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date date;
		try {
			date =new java.sql.Date( sdf.parse(request.getParameter("date")).getTime());
			String topic =request.getParameter("topic");
			String presenter = request.getParameter("presenter");
			Dao dao = new Dao();
			dao.insertEvent(new Event(date, topic, presenter));
			response.sendRedirect("Admin.jsp");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}

}
