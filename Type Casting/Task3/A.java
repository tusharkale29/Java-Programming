// string to primitive

public class A
{
	public static void main(String rgs[])
	{
		String s1="10";
		String s2="1254789653";
		String s3="25.5";
		String s4="200000.5";
	
		System.out.println(" Before Type-casting ");
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println();

		int x = Integer.parseInt(s1);
		long l = Long.parseLong(s2);
		float f  = Float.parseFloat(s3);
		double d =Double.parseDouble(s4);
		
		System.out.println(x);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

	}
}