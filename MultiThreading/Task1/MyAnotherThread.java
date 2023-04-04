
public class MyAnotherThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i=10; i>=1; i--)
		{
			System.out.println("Another Thread: " + i);
			
			try {
				
				Thread.sleep(2000);
				
			} 
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
