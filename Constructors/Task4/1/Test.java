import java.util.*;
public class Test
{
	public static void main(String args[])	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String en=sc.next();
		System.out.println();
		System.out.println("Enter ID:");
		int eid=sc.nextInt();
		System.out.println();
		System.out.println("Enter Salary");
		float esal = sc.nextFloat();
		System.out.println();
		System.out.println("Enter Designation");
		String ed=sc.next();
		System.out.println();
		System.out.println("Enter Phone no:");
		long ep = sc.nextLong();
		System.out.println();	

		Employee e1 = new Employee(en,eid,esal,ed,ep);

		System.out.println(" Employee Details: ");
		System.out.println();
		System.out.println("Name: " + e1.ename);
		System.out.println("ID: " + e1.eid);
		System.out.println("Salary: " + e1.esalary);
		System.out.println("Designitation: " + e1.edesignation);
		System.out.println("Phone no: " + e1.ephone);
		
	}
}