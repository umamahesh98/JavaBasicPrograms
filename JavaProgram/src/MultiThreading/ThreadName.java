package MultiThreading;

public class ThreadName extends Thread{
	 public void  run()
	{
		System.out.println("The name of the thread is before is  "+Thread.currentThread().getName());
		Thread.currentThread().setName("Uma");
		System.out.println("The name of the thread is before is  "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0;i<1;i++)
		{
			ThreadName threadname = new ThreadName();
			threadname.start();
		}
	}

}
