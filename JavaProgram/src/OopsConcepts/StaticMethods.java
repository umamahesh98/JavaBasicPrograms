package OopsConcepts;

public class StaticMethods {
		static int a = 5;

		public static void main(String[] args) {
			StaticMethods st = new StaticMethods();
			CallingStaticMethod();
			st.CallingNonStaticMethod();
		}

		public static void CallingStaticMethod() {
			System.out.println(StaticMethods.a);
		}

		public void CallingNonStaticMethod() {
			System.out.println("Hello");
		}
	}


