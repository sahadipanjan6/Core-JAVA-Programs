/* Write a java program to find all the leaders in an integer array. An element is said to be a leader if all the elements on it’s 
right side are smaller than it. Rightmost element is always a leader.
For e.g. 
Input Array = [1, 2, 3, 4, 5]
Leaders are : [5] */


import java.io.*;
import java.util.*;

public class LeadersInArray
{

	//function definition to find the leaders in a given array
	public static ArrayList<Integer> findLeaders(int []arr)
	{
		ArrayList<Integer> leaders = new ArrayList<Integer>();
		for(int i=0; i<arr.length-1; i++)
		{
			int flag = 0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
					continue;

				else
				{
					flag = 1;
					break;
				}

			}
			if(flag == 0)
				leaders.add(arr[i]);
		}

		//manually adding the last element of the array as the leader
		leaders.add(arr[arr.length-1]);

		return leaders;
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
		System.out.println("Enter the array elements...");
		for(int i=0; i<n; i++)
			array[i] = Integer.parseInt(br.readLine());


		//displaying the leaders of the given array
		System.out.println("Leaders are: " + findLeaders(array));


	}
}
