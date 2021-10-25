package Threads;

public class NocProcess {
    public static void main (String args[]) {

	FeeThread feeThread = new FeeThread();
    feeThread.start();
	OfficeBoy ramu = new OfficeBoy("somu the office boy");
	ramu.start();
	
}
    private static void oldSequentialWay() {
		try {
			
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
		}
		catch (Exception e) {
		}
	}
}
