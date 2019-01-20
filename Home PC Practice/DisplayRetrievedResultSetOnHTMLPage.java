import java.sql.*;
import java.io.*;

public class DisplayRetrievedResultSetOnHTMLPage
{
	public static void main(String[] args) throws Exception
	{
		String driverName = "oracle.jdbc.OracleDriver";
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String username = "scott";
		String password = "tiger";
		String sqlQuery = "select * from employees";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(jdbcURL, username, password);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(sqlQuery);
		String data = "";
		data = data+"<html><body><center><table border='1' bgcolor='green'>";
		data = data+"<tr><td>ENO</td><td>ENAME</td><td>ESAL</td><td>EADDR</td></tr>";
		
		while(rs.next())
		{
			data = data+"<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getDouble(3)+"</td><td>"+rs.getString(4)+"</td></tr>";
		}
		data=data+"</table><center></body></html>";
		
		FileOutputStream fos = new FileOutputStream("employees.html");
		byte[] b = data.getBytes();
		fos.write(b);
		fos.flush();
		System.out.println("Open employees.html to get Employees data!");
		fos.close();
		con.close();
	}
}