public class Test
{
	double num=10.99d;
	int x =(int)num;
	long l =(long)num;
	float f =(float)num;
	
	public static void main(String args[])
	{
		Test t = new Test();
		System.out.println(t.x);
		System.out.println(t.l);
		System.out.println(t.f);
	}
}