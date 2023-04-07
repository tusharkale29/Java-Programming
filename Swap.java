public class Swap
{
	public static void main(String args[])
	{
		int x=10;
		int y=20;
		int z=0;
		
		System.out.println(" Before swap :");
		System.out.println(x+" " + y);
		
		z=x;
		x=y;
		y=z; 
		
		System.out.println(" After swap : "  + "x:" + " "+ x + "  " + "y:" + "  " + y);
	}
}