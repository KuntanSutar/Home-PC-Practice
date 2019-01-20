/*
Whenever we are serializing an object the set of all objects which are reachable from that object will be serialized automatically. 
This group of objects is nothing but object graph in serialization.
In the this program, whenever we are serializing Dog object automatically Cat and Rat objects will be serialized; 
because these are part of object graph (of Dog object).
*/

import java.io.*;

class Dog implements Serializable
{
	Cat c=new Cat();
}
class Cat implements Serializable
{
	Rat r=new Rat();
}
class Rat implements Serializable
{
	int j=20;
}
class Test
{
	public static void main(String args[]) throws Exception
	{ 
		Dog d1=new Dog();
		FileOutputStream fos = new FileOutputStream("Serialization2.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("Serialization2.ser"); 
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Dog d2=(Dog)ois.readObject(); 
		System.out.println(d2.c.r.j); 
	}
}
