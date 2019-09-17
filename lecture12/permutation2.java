package lecture12;


import java.util.ArrayList;
import java.util.Scanner;

public class permutation2 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a string");
		String s = scn.nextLine();
		System.out.println(substrings(s).size());
		permutations(s,"");
		
	}
	
	public static void permutations(String str,String ans) {
		if (str.length() == 0) {
			System.out.print(ans+" ");
			return ;
		}

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			String ros = str.substring(0,i)+str.substring(i+1);
			permutations(ros,ans+ch);
			
		}
		

	}
	
	public static ArrayList<String> substrings(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = substrings(ros);
		
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {
			for (int i = 0; i <= rrs.length(); i++) {
				mr.add(rrs.substring(0, i) + ch + rrs.substring(i));
			}
		}
		return mr;

	}

}
