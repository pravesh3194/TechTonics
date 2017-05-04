package pages;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbutils.DBConnection;
import dbutils.Dao;
import oracle.net.ns.SessionAtts;
import pojo.Event;


public class Techtalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ArrayList<Event> listOfEvents = new ArrayList<Event>();   
    
    public Techtalk() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
