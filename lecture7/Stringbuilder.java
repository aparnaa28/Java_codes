package lecture7;

import java.util.Scanner;

public class Stringbuilder {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a string");
		String Str= scn.nextLine();
		String result;
		result= toggle(Str);
		System.out.println(result);
	}
	
	public static String toggle(String str)
	{
		StringBuilder sb= new StringBuilder();
		int diff='a'-'A';
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				sb.append((char)(ch-diff));
			}
			else
			{
				sb.append((char)(ch+diff));
			}
		}
		
		return (str= sb.toString());
	}

}
