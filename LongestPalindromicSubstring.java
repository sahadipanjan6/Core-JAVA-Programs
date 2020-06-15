/* Write a JAVA Program to display the longest substring of a given string(to be taken from the user) which is Palindrome.
For e.g.
Input - aaaabbaa
Output - aabbaa */


import java.io.*;
import java.util.*;

public class AllPossibleSubstrings
{

	//function to check whether a string is palindrome or not
	public static boolean isPalindrome(String str)
	{
		boolean output = false;
		if(str.equalsIgnoreCase(new StringBuffer(str).reverse().toString()))
			output = true;

		return output;

	}

	//function to return the longest palindrome
	public static String longestPalindrome(ArrayList<String> inputList)
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();

		//traversing the input list and finding the length of each string
		for(String str : inputList)
			hm.put(str, str.length());

		//returning the longest string from the HashMap
		int maxLength=Integer.MIN_VALUE;
		String maxWord = null;

		for(String key : hm.keySet())
		{
			if(hm.get(key) >= maxLength)
			{
				maxLength = hm.get(key);
				maxWord = key;
			}
			else
				continue;
		}

		return maxWord;

	}

	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string: ");
		String str = br.readLine();

		ArrayList<String> substrings = new ArrayList<String>();

		//finding out all possible substrings
		//the starting point of selecting the characters of the string
		for(int i=0; i<=str.length(); i++)
		{
			//the ending point of selecting the characters of the string
			for(int j=i; j<str.length(); j++)
			{
				StringBuffer sb = new StringBuffer();

				//selecting the characters of the string in between the starting and ending point(both inclusive)
				for(int k=i; k<=j; k++)
				{
					sb.append(str.charAt(k));
				}
				substrings.add(sb.toString());
			}
		}

		//finding out all the substrings which are palindromic
		ArrayList<String> allPalindromes = new ArrayList<String>();
		for(String str2 : substrings)
		{
			if(isPalindrome(str2) == true)
				allPalindromes.add(str2);

			else
				continue;
		}

		//displaying the longest palindromic substring
		System.out.println("Longest Palindromic Substring: " + longestPalindrome(allPalindromes));
	}
}
