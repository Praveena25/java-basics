
   
package Threads.synchronization;

public class Shamuthread extends Thread{
Table mTable;
	
	public Shamuthread(Table table) {
		mTable = table;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		mTable.printTable(100);
	}

}