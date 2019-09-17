package crux8june2018;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int c;
		int i=0;
		
			System.out.println(a);
			System.out.println(b);
		while (i <=n-1) {
			
			c = a + b;
			if(c<=n) 
			System.out.println(c);
			
			else
				break;
			a=b;
			b=c;
			i++;
			}
		
		}

	}

