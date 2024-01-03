package javjdbc;

import java.sql.*;

import javax.swing.JOptionPane;

public class Connectivity {
public static void main (String[] args) {
	
	try {
		//load the driver
		Class.forName("java.sql.Driver");
		
		//mysql connection
		String db = ("jdbc:mysql://localhost:3306/jdbc");
		String qr = "select roll, name,class from student";
		Connection con = DriverManager.getConnection(db, "root", "lelolelo");
		
		//statement 
		Statement stmt = con.createStatement();
		
		//result stmt all executing queries
		ResultSet rs = stmt.executeQuery(qr);
		
		//extract data
		int r, c;
		String n;
		while (rs.next()) {
			r = rs.getInt("roll");
			n = rs.getString("name");
			c = rs.getInt("class");
			
		}
		
		System.out.println("Java connected!");
		rs.close();
		stmt.close();
		con.close();
	
}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,  "Error in connection!");
	}
}
}
