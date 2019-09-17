package lecture9;

import java.util.Scanner;

public class queueclient {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		// System.out.println("Enter the elements");
	//	int n=scn.nextInt();
		queue q= new queue();
//	//	queue q1= new queue(n);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.enqueue(50);
		q.display();
//       
//        
//        int i=0,j=0,time=0;
//       // System.out.println("Enter the elements in first");
//        while(i<n)
//        {
//        	int val1=scn.nextInt();
//        	q.enqueue(val1);
//        	i++;
//        }
//      //  System.out.println("Enter the elements in second");
//        while(j<n)
//        {
//        	int val2=scn.nextInt();
//        	q1.enqueue(val2);
//        	j++;
//        }
//        
//        int k=0;
//        while(k<n) {
//         q.front=q.front%n;
//		if(q.getFront()==q1.getFront())
//		{	time++;
//			q.dequeue();
//			q1.dequeue();
//		}
//		else
//		{ 	while(q.getFront()!=q1.getFront()) {
//			int item=q.dequeue();
//			q.enqueue(item);
//			time++;
//			q.front=q.front%n;
//			}
//			q.dequeue();
//			q1.dequeue();
//			time++;
//		}
//		k++;
//        }
//		
//		System.out.println(time);
//		
//		
	}

}
