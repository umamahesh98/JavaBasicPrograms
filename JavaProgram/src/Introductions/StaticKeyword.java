package Introductions;

public class StaticKeyword {
	

		int c=10;
		static int cnt=10;
		static int add(int a,int b){
			return a+b;
		}
		
		public StaticKeyword() {
			c++;
			cnt++;
			System.out.println("c: "+c+" cnt: "+cnt);
		}
		
		static{
			System.out.println("static block");
		}

		public static void main(String[] args) {
			 new StaticKeyword();
			 new StaticKeyword();
			 new StaticKeyword();
			 System.out.println( StaticKeyword.add(21, 54));
		}

	}


