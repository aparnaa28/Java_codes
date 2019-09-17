package lecture12;

import java.util.ArrayList;
import java.util.Scanner;

public class keypad2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String s = scn.nextLine();
		System.out.println(substrings(s).size());
		keypad(s,"");

	}

	public static void keypad(String s, String ans) {
		if (s.length() == 0) {
			System.out.print(ans+" ");
			return ;
		}
		char ch = s.charAt(0);
		String str = getcode(ch);
		String ros = s.substring(1);
		for (int i = 0; i < str.length(); i++) {
			keypad(ros, ans+str.charAt(i));
		}

	}
	
	public static ArrayList<String> substrings(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String s = getcode(ch);
		String ros = str.substring(1);
		ArrayList<String> rr = substrings(ros);
		ArrayList<String> mr = new ArrayList<>();
		
		for (String rrs : rr) {
			for (int i = 0; i < s.length(); i++) {
				mr.add(s.charAt(i) + rrs);
			 
			}
		}
		return mr;

	}

	public static String getcode(char ch) {
		if (ch == '1')
			return "abc";
		if (ch == '2')
			return "def";
		if (ch == '3')
			return "ghi";
		if (ch == '4')
			return "jkl";
		if (ch == '5')
			return "mno";
		if (ch == '6')
			return "pqrs";
		if (ch == '7')
			return "tuv";
		if (ch == '8')
			return "wx";
		if (ch == '9')
			return "yz";
		else {
			return "";
		}
	}

}
