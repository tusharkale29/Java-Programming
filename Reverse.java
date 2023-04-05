public class Reverse
{
	public static void main(String args[])
	{
		int no=1234;
		int temp=0;
		while(no !=0)
		{
			temp=no%10;
			System.out.println(temp);
			no=no/10;
		}
	}
}