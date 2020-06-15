/* Given an array A of N positive integers. The task is to swap every ith element of the array with (i+2)th element.
Sample Input Array = [1, 2, 3, 4, 5]
Sample Output Array = [3, 4, 5, 2, 1] */


import java.io.*;
import java.util.*;

public class NeedSomeChange
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements: ");
		int n = Integer.parseInt(br.readLine());

		int []arr = new int[n];
		System.out.println("Enter the elements...");
		for(int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());


		//swapping the ith element with the (i+2)th element in the array
		for(int i=0; i<(arr.length-2); i++)
		{
			int temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp;
		}

		//displaying the final array
		System.out.println("Final Array is:- ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + "\t");

		System.out.println();
	}
}
