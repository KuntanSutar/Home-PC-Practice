import java.sql.*;

class Test
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:demodsn","scott","tiger");
		if(con != null)
		{
			System.out.println("Connection established successfully");
		}
		else
		{
			System.out.println("Connection not established");
		}
	}
}



