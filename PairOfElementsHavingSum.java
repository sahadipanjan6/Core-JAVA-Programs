/* Write a JAVA program to find all pairs of elements whose sum is equal to given number.
For e.g.
Input Array = [1, 2, 3, 4, 5, 6]
Sum to be checked = 7
Output Pairs = (1, 6), (2, 5), (3, 4) */


import java.io.*;
import java.util.*;

public class PairOfElementsHavingSum
{

	//function definition to find out the pair of elements whose sum is equal to the given sum
	public static ArrayList<ArrayList<Integer>> findPairs(int []arr, int sum)
	{
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();

		//finding all the pairs
		for(int i=0; i<arr.length-1; i++)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=i+1; j<arr.length; j++)
			{
				if((arr[i]+arr[j]) == sum)
				{
					list.add(arr[i]);
					list.add(arr[j]);
				}
			}
			if(list.size() != 0)
				outputList.add(list);
		}

		return outputList;
	}


	//the main function definition
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements: ");
		int n = Integer.parseInt(br.readLine());

		//declaring an array with size = n
		int []array = new int[n];

		//accepting the elements of the array from the user
		System.out.println("Enter the elements of the array...");
		for(int i=0; i<n; i++)
			array[i] = Integer.parseInt(br.readLine());

		System.out.println("Enter the sum to be checked: ");
		int sumCheck = Integer.parseInt(br.readLine());

		//displaying all the pair of elements in the array whose sum matches with the given sum
		System.out.println("All possible pairs: " + findPairs(array,sumCheck));


	}
}
