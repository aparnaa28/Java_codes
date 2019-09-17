package lecture2;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scn.nextInt();
		System.out.println("Enter the rotation");
		int r= scn.nextInt();
		int rem,ans;
		int digits;
		
			int i=0;
			int temp = n ;
			while(temp!=0)
			{
				i++;
				temp=temp/10;
			}
			
			digits=i;
			while(r<0)
			{
				r=r+digits;
			}
			
			r=r%digits;
			rem=(n%(int)Math.pow(10,r));
			n=(n/(int)Math.pow(10,r));
			ans=(n+rem*(int)Math.pow(10,(digits-r)));
			System.out.println(ans);
			
			
		
		
		
		
		
	}

}
