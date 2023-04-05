public class Palindrome
{
	public static void main(String args[])
	{
		int no=1111;
		int rev=0;
		int n=no;
		
		while(no !=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Original number: " +n);
		System.out.println("reverse number: " +rev);
		
		if(n==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}
}