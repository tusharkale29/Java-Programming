public class Test
{
	public Employee setDemp()
	{
		Developer d=new Developer();
		//set all data here

		d.designation="Developer";
		d.id=10214;
		d.dname="Tushar";
		d.empid=101;
		d.name="ABC";
		d.designation="Developer";
		return d;
		
	}
	public Employee setTemp()
	{

		Tester t=new Tester ();
		//set all data here

		t.designation="Tester";
		t.id=10214;
		t.tname="Ganesh";
		t.empid=101;
		t.name="ABC";
		t.designation="Tester";
		
		return t;	
	}
	public static void main(String[] args)
	{
		Test t1=new Test();
		//call methods here and get all data
		
		Developer d = (Developer)t1.setDemp();
		System.out.println(d.empid);
		System.out.println(d.name);
		System.out.println(d.designation);
		System.out.println(d.id);
		System.out.println(d.dname);
		
		System.out.println();
		
		Tester d2 = (Tester)t1.setTemp();
		System.out.println(d2.empid);
		System.out.println(d2.name);
		System.out.println(d2.designation);
		//System.out.println(d2.id);
		//System.out.println(d2.tname);
		
	}
}