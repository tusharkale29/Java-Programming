public class Test3
{
	public String m1()
	{
		return "CJC";                                               
	}
	public Object m2()
	{
		return "karvenagar" ;
	}
	public int m3()
	{
		return 10;
	}
	public double m4()
	{
		return 10d;
	}
	public byte m5()
	{
		return 25;
	}
	
	public static void main(String[] args) 
	{
		Test3 a=new Test3();

		//String s=(String)a.m1();
		//Object o=a.m1();
		//double d=(double)a.m1(); ::String cannot be converted to double

		//Object o1=a.m2();
		//String s1=(int)a.m2();  :: int cannot be converted to String
		String s2=(String)a.m2();

		long l=a.m3();
		//byte b=a.m3();  :::possible lossy conversion from int to byte
		short s3=(short)a.m3();

		double d1=a.m4();
		//String s4=(String)a.m4();::: double cannot be converted to String
	
		byte b1=a.m5();
		int i=a.m5();
	}
}