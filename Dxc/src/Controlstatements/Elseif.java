package Controlstatements;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2021;
         if(( (a % 4 == 0) && ( a % 100 !=0))||(a % 400==0)){
        	 System.out.println("its an leap year");
         }
         else {
        	 System.out.println("its an ordinary year");
         }
	}

}
