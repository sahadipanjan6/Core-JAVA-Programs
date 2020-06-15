/* Write a JAVA program to display the Fibonacci Series upto n'th term, value of n to be taken from the user.
For e.g.
Input = 6
Output = 0 1 1 2 3 5 */


import java.io.*;
import java.util.*;

public class FibonacciSeries
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of terms: ");
		int terms = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println("Fibonacci Series upto " + terms + " terms is: ");
		System.out.print(a + " " + b);

		for(int i=3; i<=terms; i++)
		{
			c = a + b;
			System.out.print(" " + c + " ");
			a = b;
			b = c;
		}
	}
}
