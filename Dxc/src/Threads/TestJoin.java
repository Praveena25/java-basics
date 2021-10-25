

package Threads;
class TestJoin extends Thread{  
	public void run(){ 
		//System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++){  
			try{  
				Thread.sleep(500);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(i+"--"+Thread.currentThread().getName());  
		}  
	}  
	public static void main(String args[]){  
		TestJoin t1=new TestJoin();  
		t1.setName("first thread");
		TestJoin t2=new TestJoin();  
		t2.setName("second thread");

		TestJoin t3=new TestJoin();  
		t3.setName("third thread");

		t1.start();  
		try{  
			t1.join();  
		}catch(Exception e){System.out.println(e);}  

		t2.start();  
		t3.start();  
	}  
}  


