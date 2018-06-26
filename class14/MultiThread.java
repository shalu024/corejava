class My{
synchronized static void Tp(int n,int My){
for(int j=My;j<=n;j++){
	

	System.out.println(j);
	try{
	Thread.sleep(3);
	}catch(Exception e){}
	}
  }  
}

public class MultiThread {
	public static void main(String[] args){

Thread mt1=new Thread(){
	public void run(){
	My.Tp(500,0);      
}

};
Thread mt2=new Thread(){
	public void run(){
	My.Tp(1000,500);

}

	};
mt1.start();
mt2.start();
}
}





	
