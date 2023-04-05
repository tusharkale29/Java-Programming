public class Abc
{
	 Abc()
	{
		System.out.println(" No - Argument Constructor " );
	}
	
	 Abc(int x, int y)
	{
		int z=x+y;
		System.out.println(" Addition is : " + z);
	}
	Abc(String s1)
	{
		System.out.println(s1);
	}
}