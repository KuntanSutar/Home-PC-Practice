import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLJDBCDemo {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodatabase", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from movies");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"..."+rs.getString(2)+"..."+rs.getString(3)+"..."+rs.getString(4));
		}
		con.close();
	}

}
