public class Test
{
	public static void main(String args[])
	{
		Customer c1 = new Customer(12," Tushar ", " Nashik ", 77658019225l);
		
		System.out.println(" Name: " + c1.cname);
		System.out.println(" Id: " + c1.cid);
		System.out.println(" Address: " + c1.caddress);
		System.out.println(" Phone no: " + c1.cphone);
		System.out.println();

		Customer c2 = new Customer(11," Pratik ", " Pune ", 77658019225l);
		
		System.out.println(" Name: " + c2.cname);
		System.out.println(" Id: " + c2.cid);
		System.out.println(" Address: " + c2.caddress);
		System.out.println(" Phone no: " + c2.cphone);
		System.out.println();
	
		Customer c3 = new Customer(13," Kunal ", " Nashik ", 77658019225l);
		
		System.out.println(" Name: " + c3.cname);
		System.out.println(" Id: " + c3.cid);
		System.out.println(" Address: " + c3.caddress);
		System.out.println(" Phone no: " + c3.cphone);
		System.out.println();
		Customer c4 = new Customer(12," Amol ", " Nashik ", 77658019225l);
		
		System.out.println(" Name: " + c4.cname);
		System.out.println(" Id: " + c4.cid);
		System.out.println(" Address: " + c4.caddress);
		System.out.println(" Phone no: " + c4.cphone);
		System.out.println();

		Customer c5 = new Customer(16," Tushar ", " Nashik ", 77658019225l);
		
		System.out.println(" Name: " + c5.cname);
		System.out.println(" Id: " + c5.cid);
		System.out.println(" Address: " + c5.caddress);
		System.out.println(" Phone no: " + c5.cphone);
	}
}