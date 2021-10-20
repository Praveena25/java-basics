package Objectclass;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		// TODO Auto-generated method stub
     findOddEven(number);   
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
