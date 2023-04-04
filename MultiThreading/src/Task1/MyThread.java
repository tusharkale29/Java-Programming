package Task1;

public class MyThread implements Runnable {
	
	public void run()
	{
		System.out.println("Thread Started");
		
	}
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		
		Thread thread = new Thread(t);
		
		thread.start();
	}

}
