/* We can add any number of objects to the file and we can read all those objects from the file but in which order we wrote objects, 
in the same order only the objects will come back. 
i.e In which order we serialized the objects, in the same order only we have to deserialize.
That is order is important.
*/

import java.io.*;

class Dog implements Serializable
{
	int i=10;
	transient int j=20;
}
class Cat implements Serializable
{
	int i=30;
	transient int j=40;
}

class Test
{
	public static void main(String args[]) throws Exception
	{
		Dog d1=new Dog();
		Cat c1=new Cat();

		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("Serialization2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		System.out.println("Serialization ended");

		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("Serialization2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		Cat c2=(Cat)ois.readObject();
		System.out.println("Deserialization ended");

		System.out.println(d2.i+"................"+d2.j);
		System.out.println(c2.i+"................"+c2.j);
	}
}

/*
O/P:
10................0
30................0
*/
