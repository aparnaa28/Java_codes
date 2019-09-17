package lecture9;

import java.util.Scanner;

import lecture9.linkedlist;


public class linkedclient {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		//System.out.println("Enter the size");
		int n=scn.nextInt();
		int k=scn.nextInt();
		linkedlist list= new linkedlist();
		for(int i=0;i<n;i++)
		{
			int item=scn.nextInt();
			list.addlast(item);;
		}
		//kthappend(list,k,n);
		list.kthappend(k);
		
	}
	
	public static void delete(int q,linkedlist ll) throws Exception
	{
		while(q>0)
		{
			System.out.println("Enter the index");
			int i=scn.nextInt();
			ll.removeAt(i);
			ll.display();
			q--;
		}
	}

	public static void kthappend(linkedlist ll,int k,int n) throws Exception
	{
		linkedlist l2= new linkedlist();
		for(int i=n-1;i>k;i--)
		{
			int item=ll.removeAt(i);
			l2.addFirst(item);
		}
		
		l2.display();
		ll.display();
		
	}
	

}
