package lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class soe {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the number");
	int n= scn.nextInt();
//	soe(n);
	System.out.println("Enter the x");
	int p=scn.nextInt();
	int ans=polynomial(p,n);
	System.out.println(ans);
	}
	
	public static void soe(int n)
	{
		boolean []primes= new boolean [n+1];
		Arrays.fill(primes, true);
		primes[0]=false;
		primes[1]=false;
		for(int table=2;table*table<=n;table++)
		{
			if(primes[table]==false)
				continue;
			for(int mult=2;mult*table<=n;mult++)
			{
				primes[mult*table]=false;
			}
		}
		
		for(int i=0;i<primes.length;i++)
		{
			if(primes[i]==true)
				System.out.println(i);
		}
	}
	
	public static int power(int num,int pow)
	{
		//base
				if(pow==0)
					return 1;
				
				if(pow%2==0)
				{
					int ans=power(num,pow/2);
					return ans*ans;
				}
				
				else
				{	int ans=power(num,pow/2);
				return num*ans*ans;}
	}
	
	public static int polynomial(int x,int n)
	{
		int sum=0,pow=x;
		for(int i=n;i>=1;i--)
		{
			sum+=i*pow;
			pow=pow*x;
		}
		return sum;
	}

}
