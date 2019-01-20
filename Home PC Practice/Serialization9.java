import java.io.*;

class Account implements Externalizable 
{ 
	String name;
	int password;
	int pincode;

	public Account() // Every Externalizable class should compulsory contains public no-arg constructor, otherwise we will get RE saying "InvalidClassException". 
	{
		System.out.println("public no-arg constructor called by JVM automatically!!!");
	}
	public Account(String name, int password, int pincode) 
	{ 
		this.name = name;
		this.password = password;
		this.pincode = pincode;
	}
	public void writeExternal(ObjectOutput oo) throws IOException 	// In Externalization this method is public 
	{ 
		oo.writeObject(name);	// In Serialization we are not considering password
		oo.writeInt(pincode);
	}
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException // In Externalization this method is public 
	{
		name = (String)oi.readObject();
		pincode = oi.readInt();
	}
}

class Test 
{
	public static void main(String[] args) throws Exception 
	{ 
		Account a1=new Account("Kuntan", 10, 20); 
		FileOutputStream fos = new FileOutputStream("abc.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("abc.ser"); 
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Account a2 = (Account)ois.readObject();
		System.out.println(a2.name+"-------"+a2.password+"-------"+a2.pincode);
	}
}

/*
If Account class implements Serializable; then total object will be saved to the File.
In this case O/P is:
Kuntan-------10-------20

If Account class implements Serializable; then only required variables will be saved to the File
In this case O/P is:
public no-arg constructor called by JVM automatically!!!
Kuntan-------0-------20
*/