package lecture2;



import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no to be reversed");
		int n = scn.nextInt();
		int rev = 0;
		int rem;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		System.out.println("The reversed no is " + rev);
	}

}
