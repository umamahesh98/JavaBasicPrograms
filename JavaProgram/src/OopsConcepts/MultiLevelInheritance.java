package OopsConcepts;

 class A {
	 {
	System.out.print("you are in class A");
	 }
}

 
 class B extends A{
	 {
	System.out.println("you are in class b");
	 }
}

 
class c extends B{
	{
	System.out.print("you are in class c");
	}
}
  class MultiLevelInheritance
{
	public static void main(String[] args)
	{
		c obj = new c();
		
		
	}

}
