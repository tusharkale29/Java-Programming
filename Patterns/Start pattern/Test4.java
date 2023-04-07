public class Test4
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			for(int k=1;k<=4;k++)	
			{
				for(int j=4;j>=k;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}
}