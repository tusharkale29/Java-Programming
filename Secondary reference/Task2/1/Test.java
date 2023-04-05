public class Test
{
	public Doctor saveData()
	{	
		Hospital h = new Hospital();
		h.id=120;
		h.name="Tushar";
		h.address="Pune";
		h.mobileno=7758019225l;

		Doctor d = new Doctor();
		d.id=123;
		d.name="Ganesh";
		d.address="Pune";
		d.salary=15632.25;
		d.mobileno=7758019225l;
		d.hp=h;
		
		return d;
	}

	public static void main(String args[])
	{
		Test t = new Test();
		
		Doctor d =t.saveData();
		
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.address);
		System.out.println(d.salary);
		System.out.println(d.mobileno);
		System.out.println(d.hp.id);
		System.out.println(d.hp.name);
		System.out.println(d.hp.address);
		System.out.println(d.hp.mobileno);
	}
}