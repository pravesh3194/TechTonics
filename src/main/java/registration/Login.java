package registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbutils.Dao;
import pojo.Employee;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		int jobID=2;
		Dao dao = new Dao();
		Employee employee = new Employee(jobID,email, password);
		
		
		try {
			int check = dao.validateEmployee(employee);
			if(check==1)
			{
				HttpSession session = request.getSession();
				session.setAttribute("email",email);
				session.setAttribute("password", password);
				response.sendRedirect("Admin.jsp");
				
			}else if(check==2){
				
				HttpSession session = request.getSession();
				session.setAttribute("email",email);
				session.setAttribute("password", password);
				response.sendRedirect("TechTalk.jsp");
			}
			else
			{
				response.sendRedirect("Login.jsp");
				PrintWriter writer = response.getWriter();
				writer.write("Invalid email or password");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

}
