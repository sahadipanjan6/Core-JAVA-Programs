/* Write a JAVA program to find out the second-highest element in a given array. */


import java.io.*;
import java.util.*;

public class SecondHighestNumber
{

	//function definition to find out the maximum element in the array
	public static int findMaximum(int []arr)
	{
		int maxElement = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(maxElement <= arr[i])
				maxElement = arr[i];
		}

		return maxElement;
	}


	//function definition to find out the second maximum element in the array
	public static int findSecondMaximum(int []arr)
	{
		int max = findMaximum(arr);
		int secondMaxElement = Integer.MIN_VALUE;

		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]!=max && secondMaxElement<=arr[j])
				secondMaxElement = arr[j];
		}

		return secondMaxElement;

	}


	//the main function definition
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements: ");
		int n = Integer.parseInt(br.readLine());

		//declaring the array with size = n
		int []array = new int[n];

		//accepting the elements of the array from the user
		System.out.println("Enter the elements of the array...");
		for(int i=0; i<n; i++)
			array[i] = Integer.parseInt(br.readLine());


		//displaying the second highest element in the array
		System.out.println("Second Highest Element: " + findSecondMaximum(array));

	}
}
