package MultiThreading;

public class MultiThreadingExample2 implements Runnable{
	
		public void run()
		{
			System.out.println("Hello all, Thread value is "+Thread.currentThread().getId());
		}
		public static void main(String[] args)
		{
			int n = 5;
			for(int i = 0;i<n;i++)
			{
			MultiThreadingExample obj = new MultiThreadingExample();
			Thread t1 = new Thread(obj);
			t1.start();
		}

	}
	}

