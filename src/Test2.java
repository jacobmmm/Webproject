
public class Test2 extends Thread {
 public void run(){
	 /*for(int i=1;i<6;i++)
	 {
		 try{Thread.sleep(500);}catch(InterruptedException e){
			 System.out.println(e.getMessage());
		 }
	 System.out.println(i);
	 }*/
	 System.out.println(Thread.currentThread().isDaemon());
 }
	public static void main(String[] args) {
		Test2 t=new Test2();
		Test2 t2=new Test2();
		Test2 t3=new Test2();
		//t.setName("Jacob");
		t.setDaemon(true);
		t.start();
		t2.start();
		t3.start();
    
	}

}
