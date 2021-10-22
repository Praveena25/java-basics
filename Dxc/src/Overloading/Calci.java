package Overloading;

public class Calci {
      void sum(int a,int b)
       {
    	   System.out.println(a+b); 
       }
      void sum(int a,long b,double c) {
    	  System.out.println(a+b+c);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Calci cl=new Calci();
           cl.sum(23,45);
           cl.sum(2,34556,1234566787);
	} 

}
