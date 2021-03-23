package LambdaExpressions;

	interface Addition
	{
		void add(int a , int b);
	}

	public class LambdaExpressions {
		
		public static void main(String[] args) {
			Addition obj = (int a,int b)-> {
					int c = a+b;
					System.out.println("The sum is "+c);
					
			
			};
			obj.add(14, 13);
			
		}

	}


