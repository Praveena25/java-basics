package exceptionhandling;

public class Sample5
{
	public static void main(String[]args) {
		try
		{
			int a[]=new int[10];
			a[15]=50/0;
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
