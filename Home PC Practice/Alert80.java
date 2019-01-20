//newInstance() method
class Student
{
	
}

class Customer
{
	
}

class Alert80
{
	static public void main(String... Kuntan) throws Exception
	{
		// Student stu = new Student(10); 							First write constructor for that & then use
		Object o = Class.forName(Kuntan[0]).newInstance();
		System.out.println("Object Created for:"+o.getClass().getName());
	}
}