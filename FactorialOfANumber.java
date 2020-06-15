/* Write a JAVA program to find out the factorial of a given integer.
For e.g.
Input Number = 5
Output = 120 */


import java.io.*;
import java.util.*;

public class FactorialOfANumber
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number: ");
		int number = Integer.parseInt(br.readLine());

		//finding out the factorial of the entered number
		int fact = 1;
		for(int i=number; i>=1; i--)
			fact = fact * i;

		//displaying the value of the factorial
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
