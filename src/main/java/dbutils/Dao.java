package dbutils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pojo.Employee;
import pojo.Event;

public class Dao {

	DBConnection db = new DBConnection();
	
	public int insertEmployee(Employee employee) throws Exception
	{
		Connection conn=db.dbConn();
		PreparedStatement preparedStatement = conn.prepareStatement("insert into employees values(?,?,?)");
		preparedStatement.setInt(1, employee.getJobID());
		preparedStatement.setString(2, employee.getEmail());
		preparedStatement.setString(3, employee.getPassword());
		preparedStatement.executeUpdate();
		conn.close();
		return 1;	
	}
	
	public int validateEmployee(Employee employee) throws Exception
	{
		String password="";
		String email="";
		int jobID=0;
		int check=0;
		Connection conn = db.dbConn();
		PreparedStatement preparedStatement = conn.prepareStatement("select * from employees where email=?");
		preparedStatement.setString(1, employee.getEmail());
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next())
		{
			jobID=resultSet.getInt(1);
			email=resultSet.getString(2);
			password=resultSet.getString(3);
			
		}
		if(password.equals(employee.getPassword()) && email.equals(employee.getEmail()))
		{
			if(jobID==1)
			{
				check=1;
			}
			else if(jobID==2)
			{
				check=2;
			}
			else
			{
				check=0;
			}
		}
		preparedStatement.close();
		conn.close();
		return check;
	}
	
	public int insertEvent(Event event) throws Exception
	{
		Connection conn=db.dbConn();
		PreparedStatement preparedStatement = conn.prepareStatement("insert into techtalk values(?,?,?)");
		preparedStatement.setDate(1, event.getDate());
		preparedStatement.setString(2, event.getTopic());
		preparedStatement.setString(3, event.getPresenter());
		preparedStatement.executeUpdate();
		preparedStatement.close();
		conn.close();
		return 1;	
	}
	
	public ArrayList<Event> fetchEvent() throws Exception
	{
		ArrayList<Event> listOfEvents=new ArrayList<Event>();
		Connection conn = db.dbConn();
		Statement statement = conn.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from techtalk");
		
		while(resultSet.next())
		{
			Date date=resultSet.getDate(1);
			String topic=resultSet.getString(2);
			String presenter=resultSet.getString(3);
			listOfEvents.add(new Event(date, topic, presenter));
		}
		
		statement.close();
		conn.close();
		
		return listOfEvents;
		
	}
	
	
}
