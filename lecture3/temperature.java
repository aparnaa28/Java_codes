package lecture3;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the max farheniet");
		int f1= scn.nextInt();
		System.out.println("Enter the min farheniet");
		int f2= scn.nextInt();
		System.out.println("Enter the step");
		int step= scn.nextInt();
		for(int i=f2;i<=f1;i+=step)
		{
			int c= (int)((5.0/9)*(i-32));
			System.out.println(i+"\t"+c);
		
	}

}
}