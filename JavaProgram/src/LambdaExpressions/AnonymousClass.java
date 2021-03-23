package LambdaExpressions;
interface AnonymousInterface
{
	void add(int a , int b);
}

public class AnonymousClass {
	
	public static void main(String[] args) {
		AnonymousInterface obj = new AnonymousInterface() {
			
			@Override
			public void add(int a, int b) {
				int c = a+b;
				System.out.println("The sum is "+c);
				
			}
		};
		obj.add(12, 13);
		
	}

}
