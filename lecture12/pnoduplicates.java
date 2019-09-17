package lecture12;

import java.util.Scanner;

public class pnoduplicates {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter a string");
	String str=scn.nextLine();
	System.out.println(permutations(str,""));

	}
	
	public static int permutations(String str,String ans) {
		if (str.length() == 0) {
			System.out.print(ans+" ");
			return 1;
		}
		
		boolean[] check=new boolean[256]; 
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(check[ch]==true)
			{
				continue;
			}
			String ros = str.substring(0,i)+str.substring(i+1);
			count+=permutations(ros,ans+ch);
			check[ch]=true;
		}
		
		return count;
		

	}

}
