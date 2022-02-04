import java.util.Scanner;
public class ExceptionalhandlingQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("..Division of Number..");
			System.out.println(" Enter the Numerator:-");
			int a = sc.nextInt();
			System.out.println(" Enter the Denominator:-");
			int b = sc.nextInt();
			sc.close();
			//Use Try block & catch block:--
			try{int c= a/b;
			System.out.println("Answer is-"+c);
		    }catch(ArithmeticException e){
		    System.out.println("//... Attempt to divide by zero {TRY AGAIN}...//");
		    throw new UnsupportedOperationException();
		   // e.printStackTrace();	
		    }finally {
		    	System.out.println(" The End:-");	
			}
		}
}
//Question2