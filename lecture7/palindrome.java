package lecture7;

import java.util.Scanner;

public class palindrome {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		boolean result;
		System.out.println("Enter a string");
		String Str= scn.nextLine();
		result= palindrome(Str);
		System.out.println(result);

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
