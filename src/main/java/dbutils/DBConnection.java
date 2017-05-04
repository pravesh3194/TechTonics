package dbutils;

import java.sql.*;

public class DBConnection {

	public Connection dbConn() throws Exception {

		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		return DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","cg044193");
	}
}
