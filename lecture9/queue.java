package lecture9;

public class queue {
	protected int[] data;
	protected int front;
	protected int size;

	public queue() {
	    data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public queue(int cap) {
		data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void enqueue(int item) throws Exception {

		if (this.size == this.data.length) {

			throw new Exception("Queue is full");
		}
		
		int index = (this.front + this.size) % this.data.length;
		this.data[index] = item;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.size == 0)
			throw new Exception("Queue is empty");

		int rv = this.data[front];
		this.front++;
		this.size--;
		return rv;
	}

	public int getFront() throws Exception {
		if (this.size() == 0)
			throw new Exception("Queue is empty");

		int rv = this.data[front];
		return rv;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int index = (i + this.front) % this.data.length;
			System.out.print(this.data[index] + " ");
		}
		System.out.println();
	}
	
	public void negative(int k)
	{
		while((this.front+k-1)!=this.size) {
			int flag=0;
		for(int i=this.front;i<this.front+k;i++)
		{
			if(this.data[i]<0)
			{
				flag++;
				System.out.print(this.data[i]+" ");
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("0");
		}
		this.front++;
	}
	}
	
	public int subsetsum(int k)
	{
		int sum=0;
		while((this.front+k-1)!=this.size) {
		for(int i=this.front;i<this.front+k;i++)
		{
			int min= minimum(this.front,k);
			int max= maximum(this.front,k);
		    sum+=min+max;
		    break;
		}

		this.front++;
	}
		return sum;
	}
	
	private int minimum(int i,int k)
	{
		int min=Integer.MAX_VALUE;
		for(int j=i;j<i+k;j++)
		{
			if(this.data[j]<min)
			{
				min=this.data[j];
			}
		}
		return min;
	}
	
	private int maximum(int i,int k)
	{
		int max=Integer.MIN_VALUE;
		for(int j=i;j<i+k;j++)
		{
			if(this.data[j]>max)
			{
				max=this.data[j];
			}
		}
		return max;
	}

}
