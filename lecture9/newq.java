package lecture9;

import java.util.Scanner;

public class newq {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int t=scn.nextInt();
		while(t>0)
		{
		//System.out.println("Enter the size of the array");
		int n=scn.nextInt();
		queue q= new queue(n);
		//System.out.println("Enter the size of subset");
		int k=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			int item=scn.nextInt();
			q.enqueue(item);
		}
		System.out.println(q.subsetsum(k));
		t--;
		}

	}

}
