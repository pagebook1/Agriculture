import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
public class dbcon{
	
	public void addData(String sql) throws SQLException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost/Agriculture","root","");
			Statement stmt = myConn.createStatement();
			 stmt.executeUpdate(sql);
//			 ResultSet rs = stmt.executeQuery(sql);
//			 rs.next();
			 myConn.close();
			 System.out.print(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,
				    "Error in Adding Data (Class addData)",
				    "Inane error",
				    JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	static class dbquery
	{
		ArrayList<String> ar = new ArrayList<String>();
		Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost/Agriculture","root","");
		public dbquery(String sql) throws SQLException, ClassNotFoundException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement stmt = myConn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			 String list;
			 while (rs.next()) { 
					list = rs.getString("barangay");
					ar.add(list);
//					System.out.println(ar);
					
			 }
		}
		
	}
}



