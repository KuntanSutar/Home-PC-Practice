import java.io.*;

class Account implements Serializable
{
	String username = "Bhaskar";
	transient String password = "Kajal";
	transient int pincode = 1234;
	
	// Both writeObject & readObject are private methods, how you can access these methods from outside of Account Class?
	// MF you (Programmer) are not calling these methods!!!
	// JVM is calling these methods!!!
	// JVM has full privilege to call these methods from outside of Account Class
	private void writeObject(ObjectOutputStream oos) throws Exception	// In Serialization this method is private
	{
		oos.defaultWriteObject();							// -> Meant for default Serialization
		String encryptedPassword = "123"+password;
		oos.writeObject(encryptedPassword);
		int encryptedPincode = pincode+4000;
		oos.writeInt(encryptedPincode);
	}
	private void readObject(ObjectInputStream ois) throws Exception		// In Serialization this method is private
	{ 
		ois.defaultReadObject();							// -> Meant for default Deserialization
		String encryptedPassword = (String)ois.readObject();
		password = encryptedPassword.substring(3);
		int decryptedPincode = (int)ois.readInt();
		pincode = decryptedPincode-4000;
	}
}
class Test
{
	public static void main(String[] args) throws Exception
	{
		Account a1 = new Account();
		
		System.out.println(a1.username+"........."+a1.password+"........."+a1.pincode);
		
		FileOutputStream fos = new FileOutputStream("abc.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("abc.ser"); 
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Account a2 = (Account)ois.readObject(); 
		
		System.out.println(a2.username+"........."+a2.password+"........."+a2.pincode); 
	}
}

