package lecture9;

public class DynamicStack extends stack {

	@Override
	public void push(int item) throws Exception
	{
		if(this.size()==this.data.length)
		{
			int []oa= this.data;
			int []na=new int[this.data.length*2];
			
			for(int i=0;i<oa.length;i++)
			{
				na[i]=oa[i];
			}
			
			this.data=na;
		}
		super.push(item);
	}
	
  
}
