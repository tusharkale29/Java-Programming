public class Test
{
	public Doctor saveData()
	{
		Hospital h = new Hospital(121,"Tushar","Pune", 7758019225l);
		Doctor d = new Doctor(101,"Ganesh", "Pune", 775895452545l, 4565.214, h);
		
	return d;
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		Doctor d = t.saveData();
		
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.address);
		System.out.println(d.mobileno);
		System.out.println(d.salary);
		System.out.println(d.hp.id);
		System.out.println(d.hp.name);
		System.out.println(d.hp.address);
		System.out.println(d.hp.mobileno);
	}
}
		
	