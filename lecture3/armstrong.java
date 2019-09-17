package lecture3;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		//System.out.println("Enter the number");
		//int num= scn.nextInt();
		System.out.println("Enter the lower limit");
		int ll= scn.nextInt();
		System.out.println("Enter the upper limit");
		int ul= scn.nextInt();
		//int nod=numberofdigits(num);
		//boolean ans=isarmstrong(num,nod);
		printarm(ll,ul);
		//System.out.println(ans);
		
		
		
	}
	
	public static int numberofdigits(int num)
	{
		int i=0;
		while(num!=0)
		{
			i++;
			num=num/10;
			
		}
		return i;
	}

	public static boolean isarmstrong(int num, int i)
	{
		int temp=num;
				boolean flag;
				int sum=0;
		while(temp!=0)
		{
			int rem= temp%10;
		 sum= sum+ (int)Math.pow(rem,i );
			temp=temp/10;
		}	
		if(sum==num)
		{
			flag=true;  //return true
		}
		else
		{
			flag=false; //return false
		}

		return flag; 
	}
	
	public static void printarm(int ll,int ul)
	{
		
		for(int i=ll;i<=ul;i++)
		{
			int nod=numberofdigits(i);
			boolean check= isarmstrong(i,nod);
			if(check==true)
			{
				System.out.println(i);
			}
			
			
		}
	}

}

