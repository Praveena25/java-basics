package exceptionhandling;

	public class Sample2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int divisor=1;
			int data=0;
			try {
			 data=100/divisor;
			System.out.println("data was "+ data);
			String s=null;  
			System.out.println(s.length());
			
			}catch(Exception e) {
				e.printStackTrace();
				divisor++;
				data=100/divisor;
				System.out.println("data is "+data);
			}
	System.out.println("6 million lines of code");
	}
	}

