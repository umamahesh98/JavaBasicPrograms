package MultiThreading;

public class PriorityThread  extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println("The priority of thread1 is " +Thread.currentThread().getPriority());
	}
	public static void main(String[] args)
	{
		PriorityThread t1 = new PriorityThread();
		PriorityThread t2 = new PriorityThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
	}

}
