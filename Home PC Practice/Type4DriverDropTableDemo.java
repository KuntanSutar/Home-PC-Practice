import java.sql.*;

class Type4DriverDropTableDemo
{
	public static void main(String[] args) throws Exception
	{
		String driverName = "oracle.jdbc.OracleDriver";
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String username = "scott";
		String password = "tiger";
		String sqlQuery = "drop table employees";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(jdbcURL, username, password);
		Statement st = con.createStatement();
		st.executeUpdate(sqlQuery);
		System.out.println("Table Deleted Successfully");
		con.close();
	}
}