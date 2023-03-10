package Task2;

// Using Constructor: 

public class Test 
{
	public static void main(String[] args) {
		
		Cource c1 = new Cource(101,"JAVA FULL DAY");
		
		Faculty f1 = new Faculty(1254, "Mahesh sir", c1);
		
		Batch b1 = new Batch(156, "FDJ 156", f1);
		
		Student s1 = new Student(22,"Tushar",b1);
		
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.batch.bid);
		System.out.println(s1.batch.bname);
		System.out.println(s1.batch.fac.fid);
		System.out.println(s1.batch.fac.fname);
		System.out.println(s1.batch.fac.cource.cid);
		System.out.println(s1.batch.fac.cource.cname);
	}

}
