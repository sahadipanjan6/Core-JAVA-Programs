/* Write a JAVA program to sort a given integer array in ascending order using the Insertion Sort methodology.
Sample Input Array = [5, 4, 3, 2, 1]
Sample Output Array = [1, 2, 3, 4, 5] */


import java.io.*;

public class InsertionSort
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements: ");
		int n = Integer.parseInt(br.readLine());

		int []arr = new int[n];
		System.out.println("Enter the elements....");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}

		//Sorting the input array using the Insertion Sort algorithm
		for(int j=1; j<arr.length; j++)
		{
			int key = arr[j];

			//insert key into the sorted sequence arr[0,.....,j-1]
			int i = j-1;
			while(i>=0 && arr[i]>key)
			{
				arr[i+1] = arr[i];
				i--;
			}

			arr[i+1] = key;

		}

		System.out.println("Sorted Array is as follows: ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + "\t");

		System.out.println();
	}
}
