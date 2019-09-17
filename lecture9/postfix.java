package lecture9;

import java.util.Scanner;

public class postfix {
    static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int cases = scn.nextInt();
		for(int c=1; c<=cases; c++) {
		System.out.println("Enter the input");
			String str = scn.next();
			stack s = new stack(str.length());
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch != '+' && ch != '*' && ch != '-' && ch != '/') {
					int n = (int) ch - '0';
					s.push(n);

				}

				else {
					int val1 = s.pop();
					int val2 = s.pop();
					int ans = calculate(ch, val2, val1);
					s.push(ans);
				}
			}
			
			s.display();}
				}

	public static int calculate(char ch, int val1, int val2) {
		if (ch == '+') {
			return val1 + val2;
		} else if (ch == '-') {
			return val1 - val2;
		} else if (ch == '*') {
			return val1 * val2;
		}
		return val1 / val2;
	}

}
