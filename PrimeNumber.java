/* Write a JAVA program to check whether a given number is PRIME or not. */


import java.io.*;
import java.util.*;

public class PrimeNumber
{

	//function definition to check whether a given number is Prime or not
	public static boolean isPrime(int number)
	{
		int factors = 0;
		boolean output = false;

		for(int i=1; i<=number; i++)
		{
			if(number%i == 0)
				factors++;
		}

		if(factors == 2)
			output = true;

		return output;
	}


	//the main function definition
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number: ");
		int number = Integer.parseInt(br.readLine());

		if(isPrime(number) == true)
			System.out.println(number + " is a Prime Number...");

		else
			System.out.println(number + " is not a Prime Number...");
	}
}
