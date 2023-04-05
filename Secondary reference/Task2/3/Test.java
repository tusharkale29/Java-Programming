public class Test
{
	public Doctor saveData()
	{
		Hospital h = new Hospital();
		h.setId(105);
		h.setName("Tushar");
		h.setAddress("Pune");
		h.setMobileno(7758019225l);
		
		Doctor d = new Doctor();
		d.setId(101);
		d.setName("Ganesh");
		d.setAddress("Pune");
		d.setMobileno(7758019225l);
		d.setSalary(145.364);
		d.setHp(h);
		
		return d;
		
	}

	public static void main(String args[])
	{
		Test t = new Test();
		Doctor d = t.saveData();
		
		System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println(d.getAddress());
		System.out.println(d.getMobileno());
		System.out.println(d.getSalary());
		System.out.println(d.getHp().getId());
		System.out.println(d.getHp().getName());
		System.out.println(d.getHp().getAddress());
		System.out.println(d.getHp().getMobileno());	
			
	}
}