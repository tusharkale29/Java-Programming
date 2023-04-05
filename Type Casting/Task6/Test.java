public class Test
{
	public A m1()
	{
		B b1 = new B();
		b1.x=10;
		b1.y=20;
		b1.y=50;
		b1.z=30;
		
		return b1;
	}
		
	public C m2()
	{
		C c1 = new C();
		c1.a=100;
		c1.b=200;
		c1.x=10;
		c1.y=20;
		c1.z=40;
		
		return c1;
	} 
	
	public static void main(String args[])
	{
		Test t1 = new Test();
		
		 B a=(B)t1.m1();
		
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);
		System.out.println();
		
		C c=(C)t1.m2();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		System.out.println();
	}
}