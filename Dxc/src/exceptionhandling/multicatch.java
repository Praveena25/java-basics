package exceptionhandling;

public class multicatch
{
	public static void main(String[]args) {
		try
		{
		String s =null;
		System.out.println(s.length());		
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception occur");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds exception occur");	
		}
		catch(Exception e)
		{
			System.out.println("common exception occurs");
		}
		System.out.println("ended");
	}
}
