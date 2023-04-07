public class B extends A
{
	public B()
	{
		this(10);
		System.out.println("Constructor---B");
	}
	public B(int x)
	{
		System.out.println("Constructor--B--int");	
	}
}