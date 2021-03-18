package OopsConcepts;

import java.util.Scanner;

public class OverLoading {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int result = 0;
	System.out.println("Enter HOw maany numbers you want to Add");
    int n = sc.nextInt();
    System.out.println("Enter the numbers");
    for( int i =1;i<=n;i++)
    {
    	 int a = sc.nextInt();
    	 result = result + a;
    }
    System.out.println("The sum of the given number is "+result);
    
   
  /* // int b = sc.nextInt();
	OverLoading obj = new OverLoading();
	obj.add(5,10);
}
public void add(int a, int b, int c)
{
	int d = a+b+c;
	System.out.println("the sum of 3 numbers is "+ d);
}
public void add(int x, int y)
{
	int z = x+y;
	System.out.println("the sum of two numbers is "+z);
}
public void add(int p,int q, int r, int s)
{
	int d= p+q+r+s;
			System.out.println("the sum of 4 numbers is "+d);
}
}
*/
}
}