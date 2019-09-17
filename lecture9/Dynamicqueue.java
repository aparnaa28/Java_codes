package lecture9;

public class Dynamicqueue extends queue {
	@Override
	public void enqueue(int item) throws Exception {
    if(this.size()==this.data.length)
    {
    	int oa[]= this.data;
    	int na[]= new int [this.data.length*2];
    	
    	for (int i = 0; i < this.size; i++) {
			int index = (i + this.front) % this.data.length;
			na[i]=oa[index];
		}
    	this.data=na;
    	this.front=0;
    }
  super.enqueue(item);	

}
}