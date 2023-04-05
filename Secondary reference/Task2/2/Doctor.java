public class Doctor
{
	int id;
	String name;
	String address;
	long mobileno;
	double salary;
		
	Hospital hp;
	
	public Doctor(int id, String name, String address, long mobileno, double salary, Hospital hp)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.mobileno=mobileno;
		this.hp=hp;
	}
}