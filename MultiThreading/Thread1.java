public class MyThread implements Runnable {
	
	public void run()
	{
		System.out.println("Thread Started");
		for(int i=0; i<=10; i++)
		{
			System.out.println("Value of i: " + i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		
		Thread thread = new Thread(t);
		
		thread.start();
	}

}
