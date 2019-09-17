package lecture12;

import java.util.Scanner;

public class plexico {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String str = scn.nextLine();
		permutations(str, "", false);

	}

	public static void permutations(String str, String ans, boolean isLarger) {
		if (str.length() == 0&&isLarger==true) {
			
				System.out.print(ans + " ");
			
			return ;
		}

		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			if (isLarger) {
				 permutations(ros, ans + ch, true);
			} else {
				if (ch > str.charAt(0))
					 permutations(ros, ans + ch, true);
				else if (ch < str.charAt(0)) {
					// nocall
				} else
					 permutations(ros, ans + ch, false);
			}

		}

		

	}

}
