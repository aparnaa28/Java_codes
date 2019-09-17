package lecture8;

import java.util.Scanner;

public class psubstrings {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str = scn.nextLine();
		int result;
		result = psubstrings(str);
		System.out.println(result);
	}

	public static int psubstrings(String s) {
		int count = 0;
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; (axis + orbit) <= s.length() - 1 && (axis - orbit) >= 0; orbit++) {
				if (s.charAt(orbit + axis) == s.charAt(axis-orbit))
					count++;
				else
					break;
			}
		}

		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; (axis + orbit) <= s.length() - 1 && (axis - orbit) >= 0; orbit++) {
				if  (s.charAt((int) (orbit + axis)) ==  s.charAt((int) (axis-orbit)))
					count++;
				else
					break;
			}
		}
		return count;
	}

}
