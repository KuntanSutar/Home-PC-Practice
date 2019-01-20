/*
If parent class implements Serializable, then automatically every child class by default implements Serializable. 
That is Serializable nature is inheriting from parent to child.
Hence, even though child class doesn't implements Serializable, 
we can serialize child class object if parent class implements serializable interface.
*/

import java.io.*;
class Animal implements Serializable
{
	int i=10;
}
class Dog extends Animal
{
	int j=20;
}
class Test
{
	public static void main(String[] args) throws Exception
	{
		Dog d1=new Dog();
		System.out.println(d1.i+"........"+d1.j);
		FileOutputStream fos = new FileOutputStream("abc.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("abc.ser"); 
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Dog d2 = (Dog)ois.readObject(); 
		System.out.println(d2.i+"........"+d2.j); 
	}
}
