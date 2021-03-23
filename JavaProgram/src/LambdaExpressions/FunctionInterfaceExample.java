package LambdaExpressions;

interface Cab {
	void bookCab(String s1);
}

class FunctionInterfaceExample implements Cab {
	public void bookCab(String s1) {
		System.out.println(s1);
	}
	public static void main(String[] args) {
		FunctionInterfaceExample olacab = new FunctionInterfaceExample();
		olacab.bookCab("Hello all, welcome to ola");
		

}
}
