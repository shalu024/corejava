class DynamicList{

private static final int Old_size=10;
private Object data[];
private int count;
private int size;

public DynamicList()
{
	this.data=new Object[Old_size];
	this.size=Old_size;
}
	public void add(Object obj)
	{
      System.out.println("count : "+this.count+"|| "+"size:" +this.size+"data size:"+this.data.length);
      if(this.count==this.size-1){
      	increase();
      }
      data[this.count]=obj;
      this.count++;
	}
	private void increase(){
		this.size=(int)(Old_size*1.5f);
		Object newData[]=new Object[this.size];
		for(int i=0; i<data.length; i++){
			newData[i]=data[i];
		}
		this.data=newData;
		System.out.println("***count:"+this.count+" size:"+this.size+"data size:"+this.data.length);
	}
	void show(){
		int c=0;
		for(Object element:data){
			System.out.println(c+"tn element of Array:"+element);
			c++;
		}
	}
	public static void main(String[] args)throws Exception{
		DynamicList n= new DynamicList();
		n.add("0");
		n.add("1");
		n.add("2");
	    n.add("3");
	    n.add("4");
	    n.add("5");
	    n.add("6");
	    n.add("7");
	    n.add("8");
	    n.add("9");
	    n.add("A");
	    n.add("B");
	    n.add("C");
	    n.add("D");
	    n.add("A");
	    n.show();
	}
}

	
