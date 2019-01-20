// Precedence while resolving class names:
// 1. Explicit class import 
// 2. Classes present int Current Working Directory
// 3. Implicit class import

import java.util.Date;
import java.sql.*;
class Bomb44
{
	static public void main(String... Kuntan)
	{ 
		Date date = new Date();		// Date class present in both the packages util & sql. precedence is given to explicit class import: java.util.Datei.e 
		System.out.println(date.getClass().getName());
	}
}