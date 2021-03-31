package Java8Concepts;


interface Display
{
	void display();
}

public class AnonymousClassExample {
	public static void main(String[] args)
	{
		int a = 10;
		Display d1 = new Display(){
		public void display() 
		{
		
			System.out.println("The value of a is "+a);
		}
		};
		d1.display();
	}

}


