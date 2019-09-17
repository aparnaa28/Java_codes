package lecture7;

import java.util.Scanner;

public class recursion {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter n");	
	int n= scn.nextInt();
    Incdec(n);
	}
	
	public static void Incdec(int n)
	{
		if(n==0)
			return;
		
		System.out.println(n);
		
		Incdec(n-1);
		
		System.out.println(n);
		
	}

}
