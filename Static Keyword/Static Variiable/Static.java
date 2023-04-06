class Static {
	
	int empid;
	String name;
	static String company = "TCS";
	
	public Static(int empid, String name)
	{
		this.empid=empid;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}

	public static void main(String args[])
	{
		Static s1 = new Static(101,"Tushar");
		s1.display();
		
	}
}