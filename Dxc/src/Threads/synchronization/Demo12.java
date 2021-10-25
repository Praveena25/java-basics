   
package Threads.synchronization;

public class Demo12 {
	
	public static void main(String[] args) {
		Table table = new Table(); //common object for both the threads
		
		Shamuthread shamuthread = new Shamuthread(table);
		Ramuthread ramuthread = new Ramuthread(table);
		
		shamuthread.start();
		ramuthread.start();
	}
}
