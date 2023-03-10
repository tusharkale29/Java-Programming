package Task1;

// Using setter getter method: 

public class Test 
{
	public static void main(String[] args) {
		
		Cource c1 = new Cource();
		c1.setCid(101);
		c1.setName("JAVA FULL DAY");
		
		Faculty f1 = new Faculty();
		f1.setFid(2456);
		f1.setFname("Mahesh sir");
		f1.setCource(c1);
		
		Batch b1 = new Batch();
		b1.setBid(156);
		b1.setBname("FDJ 156");
		b1.setFac(f1);
		
		Student s1 = new Student();
		s1.setName("TUSHAR");
		s1.setRollno(22);
		s1.setBatch(b1);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
		System.out.println(s1.getBatch().getBid());
		System.out.println(s1.getBatch().getBname());
		System.out.println(s1.getBatch().getFac().getFid());
		System.out.println(s1.getBatch().getFac().getFname());
		System.out.println(s1.getBatch().getFac().getCource().getCid());
		System.out.println(s1.getBatch().getFac().getCource().getName());
		
		
	}

}
