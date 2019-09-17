package lecture7;

import java.util.Scanner;

public class power {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the number");
	int n= scn.nextInt();
	System.out.println("Enter the power");
	int p= scn.nextInt();
	int result;
	result= power(n,p);
	System.out.println(result);

	}
	
	public static int power(int n,int p)
	{
		//base
		if(p==0)
			return 1;
		
		//assumption
		int ans=power(n,p-1);
		
		//self work
		return n*ans;
	}

}
