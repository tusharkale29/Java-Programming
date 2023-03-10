package Task3;

// Simple way:

public class Test 
{
	public static void main(String[] args) {
		
		
		Cource c1 = new Cource();
		
		c1.cid=101;
		c1.cname="JAVA FULL DAY";
		
		Faculty f1 = new Faculty();
		f1.fid=2456;
		f1.fname="Mahesh sir";
		f1.cource=c1;
		
		Batch b1 = new Batch();
		b1.bid=156;
		b1.bname="FDJ 156";
		b1.fac=f1;
		
		Student s1 = new Student();
		s1.name="TUSHAR";
		s1.rollno=22;
		s1.batch=b1;
		
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
