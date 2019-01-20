import java.lang.reflect.*;
class EyeOpener2
{
	static public void main(String... Kuntan) throws Exception
	{
		int count=0;
		Class c = Class.forName("java.lang.Object");
		Method[] methods=c.getDeclaredMethods();
		for(Method method1:methods)
		{
			count++;
			System.out.println(method1.getName());
		}
		System.out.println("Number of methods:"+count);
	}
}

O/P:

finalize
wait
wait
wait
equals
toString
hashCode
getClass
clone
notify
notifyAll
registerNatives
Number of methods:12