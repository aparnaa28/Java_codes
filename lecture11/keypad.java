package lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class keypad {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String s = scn.nextLine();
		System.out.println(substrings(s));
	}

	public static String getcode(char ch) {
		if (ch == '1')
			return "abc";
		if (ch == '2')
			return "def";
		if (ch == '3')
			return "ghi";
		if (ch == '4')
			return "jklm";
		if (ch == '5')
			return "nop";
		if (ch == '6')
			return "qr";
		if (ch == '7')
			return "stu";
		if (ch == '8')
			return "vw";
		if (ch == '9')
			return "xyz";
		else {
			return "";
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

}
