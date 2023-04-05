// primitive to string:

public class B
{
	public static void main(String args[])
	{
		int i=10;
		long l=1254789653l;
		float f=25.5f;
		double d =200000.5;	
		byte b =25;
			
		System.out.println(" Before Type-casting ");
		System.out.println();
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println();

		String s1 = String.valueOf(i);
		String s2 = String.valueOf(l);
		String s3 = String.valueOf(f);
		String s4 = String.valueOf(d);
		String s5 = String.valueOf(b);
		
		System.out.println(" After Type-casting ");
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}

	