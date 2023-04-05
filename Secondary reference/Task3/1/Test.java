public class Test
{
	public static void main(String args[])	
	{
		Batch b=new Batch();
		b.id=101;
		b.name="B154";
		
		Faculty f = new Faculty();
		f.id=1021;
		f.name="Ganesh";
		f.mobileno=7758019225l;
		f.gender='m';
		f.batch=b;

		Student s=new Student();
		s.id=10245;
		s.name="Tushar";
		s.address="Pune";
		s.course="BCA";
		s.fact=f;
		System.out.println();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.address);
		System.out.println(s.course);
		System.out.println();
		System.out.println(s.fact.id);
		System.out.println(s.fact.name);
		System.out.println(s.fact.mobileno);
		System.out.println(s.fact.gender);
		System.out.println();
		System.out.println(s.fact.batch.id);
		System.out.println(s.fact.batch.name);
	}
}
