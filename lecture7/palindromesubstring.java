package lecture7;

import java.util.Scanner;

public class palindromesubstring {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a string");
		String Str= scn.nextLine();
		substrings(Str);
	}
	
	public static void substrings(String str)
	{
		boolean result=false;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String ss=str.substring(i,j);
				result=palindrome(ss);
				if(result==true)
					count++;
				
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean palindrome(String str)
	{
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
				return false;
			
			left++;
			right--;
		}
		return true;
	}
}
