/*
static variable is not part of object state, hence they won't participate in serialization. 
Hence, declaring a static variable as transient, is of no use. It will not make any sense.
Original value will be transmitted to serialized object.
*/

import java.io.*;

class Dog implements Serializable
{
	int i = 10;
	transient static int j = 20;	
}

class Test
{
	static public void main(String... Kuntan) throws Exception
	{
		Dog d1 = new Dog();
		
		System.out.println("Serialization started");
		// Following 3 steps are called Serialization
		// Process of converting an object from java supported form to either network supported form or file supported form.
		FileOutputStream fos = new FileOutputStream("Serialization1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		
		System.out.println("Deserialization started");
		// Following 3 steps are called De-serialization
		// Process of converting an object from file supported form or network supported form to java supported form.
		FileInputStream fis = new FileInputStream("Serialization1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println("Deserialization ended");
		
		System.out.println(d2.i+"..."+d2.j);
	}
}