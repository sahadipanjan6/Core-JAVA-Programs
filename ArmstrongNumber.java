/*Write a JAVA program to check whether a given number is an Armstrong Number or not. An Armstrong number is a special type
of number whose sum of individual digits raised to the power of the number of digits will be equal to the actual number.
For e.g. 
Input = 153
Output = 153 is an Armstrong Number*/


import java.io.*;
import java.util.*;

public class ArmstrongNumber
{

	//function definition to count the number of digits in a given number
	public static int countDigits(int number)
	{
		int count = 0;
		int copy = number;

		while(copy != 0)
		{
			count++;
			copy /= 10;
		}

		return count;
	}


	//function definition to check whether a given number is Armstrong or not
	public static boolean isArmstrong(int number)
	{
		int digitsCount = countDigits(number);
		int copy = number;
		int sum = 0;
		boolean output = false;

		while(copy != 0)
		{
			sum += Math.pow((copy%10),digitsCount);
			copy /= 10;
		}

		if(number == sum)
			output = true;

		return output;
	}


	//the main function definition
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number: ");
		int number = Integer.parseInt(br.readLine());

		//checking whether the entered number is Armstrong or not
		if(isArmstrong(number) == true)
			System.out.println(number + " is an Armstrong Number...");

		else
			System.out.println(number + " is not an Armstrong Number...");
	}
}
