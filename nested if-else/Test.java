public class Test
{
	public static void main(String args[])
	{
		int age=20;
		int wt=48;
		if(age>=21)
		{
			System.out.println("Age is valid");
			if(wt>=50)
			{
				System.out.println("Wt is corres");
			}
			else
			{
				System.out.println("WT is not correct");
			}
		}
		else
		{
			System.out.println("please check the age");
		}
	}
}