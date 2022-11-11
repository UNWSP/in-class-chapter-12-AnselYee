package inclass12;

public class GoTooFar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5};
		try {
			for(int i=0;i<6;i++) {
				System.out.println("The numbers are: "+array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException Exception)
		{
			System.out.println("Now you've gone too far.");
		}
		

}
}
