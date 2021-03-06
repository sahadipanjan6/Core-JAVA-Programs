/*Write a JAVA program to sort a given integer array in ascending order using the Bubble Sort methodology.
Sample Input Array = [5, 4, 3, 2, 1]
Sample Output Array = [1, 2, 3, 4, 5] */


import java.io.*;

public class BubbleSort
{

	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements: ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter the elements...");
		int []arr = new int[n];

		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(br.readLine());


		//sorting the input array using Bubble Sort algorithm
		for(int j=0; j<(arr.length-1); j++)
		{
			for(int k=0; k<(arr.length-j-1); k++)
			{
				if(arr[k] > arr[k+1])
				{
					arr[k] = arr[k] + arr[k+1];
					arr[k+1] = arr[k] - arr[k+1];
					arr[k] = arr[k] - arr[k+1];
				}
			}
		}

		//displaying the sorted array
		System.out.println();
		System.out.println("Sorted Array is as follows: ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + "\t");

		System.out.println();
	}
}
