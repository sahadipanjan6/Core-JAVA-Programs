/* Write a JAVA program to sort a given integer array in ascending order using the Selection Sort methodology.
Sample Input Array = [5, 4, 3, 2, 1]
Sample Output Array = [1, 2, 3, 4, 5] */


import java.io.*;
import java.util.*;

public class SelectionSort
{

	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements: ");
		int n = Integer.parseInt(br.readLine());

		int []arr = new int[n];
		System.out.println("Enter the elements...");
		for(int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());


		//selection sort of the input array
		for(int i=0; i<(arr.length-1); i++)
		{
			int min_idx = i;

			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[min_idx])
					min_idx = j;
			}

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}


		//displaying the sorted array
		System.out.println("Sorted Array is as follows:- ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + "\t");

		System.out.println();
	}
}
