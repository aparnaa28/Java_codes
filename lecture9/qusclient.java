package lecture9;

public class qusclient {

	public static void main(String[] args) throws Exception {
	 queueusingstacks queue= new queueusingstacks();
	 
	 queue.enqueue(10);
	 queue.enqueue(20);
	 queue.enqueue(30);
	 queue.enqueue(40);
	 queue.dequeue();
//	System.out.println(val);
 queue.enqueue(50);
	 
	 queue.display();
	 

	}

}
