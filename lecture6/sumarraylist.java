package lecture6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sumarraylist {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int a1[],a2[];
		ArrayList<Integer>list=new ArrayList<>();
		a1=Takeinput();
		a2=Takeinput();
		list=sum(a1,a2);
		System.out.println(list);
	}
	
	public static int [] Takeinput()
	{
		System.out.println("Enter the size of the array");
		int n= scn.nextInt();
		int []arr= new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		return arr;
		
	}
	
	
	
	public static ArrayList<Integer>sum(int[]arr1,int[]arr2)
	{
		ArrayList<Integer>list=new ArrayList<>();
		int j=arr2.length-1,sum,rem=0,c=0,i=arr1.length-1;
		while(i>=0||j>=0)
		{
			sum=c;
			if(i>=0)
			{
				sum+=arr1[i];
			}
			
		    if(j>=0)
			{
				sum+=arr2[j];
			}
		    
			rem=sum%10;
			c=sum/10;
			list.add(0,rem);
			i--;
			j--;
			}
			if(c!=0)
			{
				list.add(0,c);
			}
		
		return list;
	}
}
