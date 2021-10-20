package Objectclass;


public class Oddeven {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
     findOddEven(13);   
	}

	private static void findOddEven(int number) {
		// TODO Auto-generated method stub
		if(number %2==0) {
			System.out.println(number+" is  even number");
		}
		else{
			System.out.println(number+"  is  Odd number");
		}
	}
	
}
