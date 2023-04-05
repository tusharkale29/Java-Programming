public class Data
{
	public Data (float f)
	{
		System.out.println(f);
	}
	public Data (char c)
	{
		System.out.println(c);
	}
	public Data (boolean b)
	{
		System.out.println(b);
	}
	public Data (double d)
	{
		System.out.println(d);
	}
	
	public static void main(String args[])
	{
		Data d1 = new Data(12.32);
		Data d2 = new Data('A');
		Data d3 = new Data(true);
		Data d4 = new Data(45.325);
	}
}