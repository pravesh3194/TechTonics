package registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbutils.DBConnection;
import dbutils.Dao;
import pojo.Employee;

public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignUp() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		int jobID=2;
		
		Dao dao = new Dao();
		Employee employee =new Employee(jobID,email, password);
		try {
			int i = dao.insertEmployee(employee);
			if(i==1)
			{
				response.sendRedirect("index.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}