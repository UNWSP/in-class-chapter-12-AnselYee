package inclass12;
import java.util.*;
public class TryToParseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int intinput=0;
		try {
			System.out.println("Enter an integer");
			String stringinput=input.next();
			intinput=Integer.parseInt(stringinput);
		}
		catch(NumberFormatException Exception) {
			System.out.println("Input is not an integer. Please enter an integer");
			System.exit(0);
		}
		System.out.println("The integer is: "+intinput);			
	}

}
