/*
1.Even though parent class does not implements Serializable Interface, 
we can serialize child object iff child class implements Serializable Interface.

2.At the time of serialization JVM will check if any variable is coming from non-Serializable parent or not? 
If any variable inheriting form non-Serializable parent, JVM ignores original value JVM & saves default values for those variables to the file.

3.At the time of Deserialization JVM checks whether any parent class is non Serializable or not? 
If any parent class is non-Serializable, then JVM will execute Instance Control Flow in every non-Serializable parent 
and shares its instance variables to the current object (Deserialized object).

4.While executing Instance Control Flow of non-Serializable parent, 
JVM always calls no arg constructor (default constructor) of that non Serializable parent. 
Hence, every non Serializable parent should compulsory contain no arg constructor (default or explicitly provided by programmer); 
otherwise we will get RE "InvalidClassException".

5.If non-serializable parent is abstract class, 
then just instance control flow will be performed for it and it's instance variables will be share to the current object (Deserialized object).
*/

import java.io.*;

class Animal
{
	int i=10;
	Animal()
	{
		System.out.println("Animal Constructor called!!!");
	}
}
class Dog extends Animal implements Serializable
{
	int j=20;
	Dog()
	{
		System.out.println("Dog Constructor called!!!");
	}
}
class Test
{
	public static void main(String[] args) throws Exception
	{
		Dog d1=new Dog();
		d1.i=888;
		d1.j=999;

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+"........."+d2.j);
	}
}
