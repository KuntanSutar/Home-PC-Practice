// Inside a method if any exception occurs; then that method in which it is rised is responsible to create exception object (Name, Description, Stack Trace i.e location)
// After creating exception object; method handovers that object to JVM
// JVM will check whether method contains any exception handling code or not?
// If the method doesn't contain any exception handling code; then JVM terminates that method abnormally & removes corresponding entry from runtime stack
// Then, JVM identifies caller method & check whether caller method contains any exception handling code or not?
// If caller method doesn't contain any exception handling code; then JVM terminates that caller method abnormally & removes corresponding entry from runtime stack
// This process will be continued until main() method 
// If main() method also doesn't contain any exception handling code; then JVM terminates main() method abnormally & removes corresponding entry from runtime stack
// Then, JVM handovers responsbility of exception handling to Default Exception Handler; which is the part of JVM
// Default Exception Handler prints Exception Info & terminates program abnormally
// Exception Info: Exception in thread "Thread Name" Name of Exception: Description of Exception 
//				   Stack Trace (Location)

class EH1
{
	static public void main(String... Kuntan)
	{
		doStuff();
	}
	static public void doStuff()
	{
		doMoreStuff();
	}
	static public void doMoreStuff()
	{
		System.out.println(10/0);
	}
}