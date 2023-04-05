public class Test
{
	public static void main(String args[])
	{
		Address a = new Address();
		a.cityname ="Pune";
	
		Student s = new Student();
		s.rollno=12;
		s.name="Tushar";
		s.adr=a;
		
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.adr.cityname);
	}
}