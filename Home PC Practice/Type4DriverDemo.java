import java.sql.*;

class Type4DriverDemo
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Type 4 Driver Demo:");
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from movies");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"..."+rs.getString(2)+"..."+rs.getString(3)+"..."+rs.getString(4));
		}
		con.close();
	}
}


