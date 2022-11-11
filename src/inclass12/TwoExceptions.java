package inclass12;

public class TwoExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("This is a try block");
			int []num= {10,0};
			int Divide=10/0;
			for(int i=0;i<3;i++)
			{
				System.out.println("The numbers in array: "+num[i]);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Error:"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException Exception)
		{
			System.out.println("Array index out of bounds");
		}
		finally
		{
            System.out.println (":: Finally Block ::");
            System.out.println ("No Exception::finally block executed");
        } 

	}

}
