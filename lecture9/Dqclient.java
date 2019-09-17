package lecture9;

public class Dqclient {

	public static void main(String[] args) throws Exception  {
		queue q= new Dynamicqueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.dequeue();
      //  q.display();
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.display();
       // actualreverse(q);
       // q.display();
        displayreverse(q,0);
        q.display();
	}
	
	public static void actualreverse(queue q) throws Exception
	{
		if(q.size==0)
		{
			return;
		}
		
		int val=q.dequeue();
		actualreverse(q);
		System.out.println(val);
		q.enqueue(val);
	}
	
	public static void displayreverse(queue q,int count) throws Exception
	{
		if(count==q.size)
		{
			return;
		}
		
		int val=q.dequeue();
		q.enqueue(val);
		displayreverse(q,count+1);
		System.out.println(val);
	}

}
