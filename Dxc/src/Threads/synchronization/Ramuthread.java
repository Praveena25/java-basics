
   
package Threads.synchronization;

public class Ramuthread extends Thread{
	Table mTable;
	
	public Ramuthread(Table table) {
		mTable = table;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		mTable.printTable(5);
	}

}

