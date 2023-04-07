public class Nod
{
	public static void main(String args[])
	{
		int no=1234;
		int nod=0;
		while(no!=0)
		{
			no=no/10;
			nod++;
		}
		System.out.println(nod);
	}
}