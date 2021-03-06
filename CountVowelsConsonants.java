/*Write a JAVA Program to count the number of vowels and consonants present in a given string(to be taken from the user).
For e.g.
Input = "Dipanjan"
Output: Number of Vowels = 3, Number of Consonants = 5 */


import java.io.*;
import java.util.*;

public class CountVowelsConsonants
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string: ");
		String str = br.readLine();

		String vowels = "AEIOUaeiou";
		int countVowels = 0;
		int countConsonants = 0;

		for(int i=0; i<str.length(); i++)
		{
			if(vowels.contains(str.charAt(i)+""))
				countVowels++;
			else
				countConsonants++;
		}

		//displaying the count of vowels and consonants
		System.out.println("Count of Vowels: " + countVowels);
		System.out.println("Count of Consonants: " + countConsonants);
	}
}
