public class Doctor
{
	int id;
	String name;
	String address;
	long mobileno;
	double salary;
	Hospital hp;
		
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setMobileno(long mobileno)
	{
		this.mobileno=mobileno;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setHp(Hospital hp)
	{
		this.hp=hp;
	}

	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public long getMobileno()
	{
		return mobileno;
	}
	public double getSalary()
	{
		return salary;
	}
	public Hospital getHp()
	{
		return hp;
	}
 
	
} 