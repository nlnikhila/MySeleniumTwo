import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Connection conn = null;
		try {
		    // db parameters
		    String url       = "jdbc:mysql://localhost:3306/tutorials";
		    String user      = "root";
		    String password  = "admin";
		 
		    // create a connection to the database
		    conn = DriverManager.getConnection(url, user, password);
		    System.out.println("Database Connected...");
		    // more processing here
		    // ... 
		    Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery("SELECT tutorial_title FROM tutorials_tbl");
		    while (rs.next()) {
		    	  String lastName = rs.getString("tutorial_title");
		    	  System.out.println(lastName + "\n");
		    }
		} catch(SQLException e) {
		   System.out.println(e.getMessage());
		} finally {
		 try{
		           if(conn != null)
		             conn.close();
		 }catch(SQLException ex){
		           System.out.println(ex.getMessage());
		 }
		}
	}

}
