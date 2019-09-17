package crux8june2018;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter any number");
		int n = scn.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("no is even");
		} else {
			System.out.println("No is odd");
		}

	}

}