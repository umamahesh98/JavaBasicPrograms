package Java8Concepts;
import java.util.*;
public class ParallelSortArray {
	public void parallelArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements");
		for(int i = 0;i<size;i++)
		{
		array[i] = sc.nextInt();
		}
		System.out.println("Before sorting.............");
		for(int j:array)
		{
			System.out.print(j+" ");
		}
		System.out.println( );
		Arrays.parallelSort(array);
		System.out.println("After sorting.........");
		for(int j:array)
		{
			System.out.print(j+" ");
		}
		
	}
	public static void main(String[] args)
	{
		ParallelSortArray arrayobj = new ParallelSortArray();
		arrayobj.parallelArray();
	}

}
