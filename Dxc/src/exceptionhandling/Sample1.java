package exceptionhandling;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor=0;
		int data=0;
		try {
			divisor=0;
		 data=100/divisor;
		System.out.println("data is"+ data);
		}catch(Exception e) {
			e.printStackTrace();
			divisor++;
			data=100/divisor;
			System.out.println("data is "+data);
		}
System.out.println("6 million lines of code");
}
}
