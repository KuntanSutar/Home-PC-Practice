class FinalvsImmutable
{
	public static void main(String[] args)
	{
		final StringBuffer sb = new StringBuffer("durga");
		sb.append("soft");
		System.out.println(sb);
		//sb = new StringBuffer(solution);
	}
}

// final applicable for variables; not for objects. Immutability applicable for objects; not for variables. 
// By declaring a reference variable as final; we won't get any immutability nature.
// Even though reference variable is final we can perform any type of change in correspnding object; but we can't perform reassignment 
// for that variable. 
// Hence final & immutable both are different concepts 