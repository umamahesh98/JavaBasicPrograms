package Java8Concepts;

interface Displayable
{
	void display();
}

public class LambdaExpressionExample {
	public static void main(String[] args)
	{
		int a = 10;
		Displayable d1 = ()->
		{
			System.out.println("The value of a is "+a);
		};
		d1.display();
	}

}
