package lecture6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int a1[],a2[];
		ArrayList<Integer>list=new ArrayList<>();
		a1=Takeinput();
		a2=Takeinput();
		list=Intersection(a1,a2);
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
	
	
	
	public static ArrayList<Integer>Intersection(int[]arr1,int[]arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer>list=new ArrayList<>();
		int j=0,i=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if((arr1[i]==arr2[j]))
			{
				list.add(arr1[i]);
				j++;
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else
				i++;
			
		}
		
		return list;	
	}

}
