import java.util.Scanner; 
/*withdraw functionality*/
//Making first user Define exception//
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException()
	{
		super("***InsufficientBalance in your account***");
	}
}
// Making second user define exception//
class IllegalBankTransactionException  extends Exception{
	IllegalBankTransactionException ()
	{
		super("***IllegalBankTransaction or not valid***");
	} 
}

public class example {

	public static void main(String[] args) throws IllegalBankTransactionException,InsufficientBalanceException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount you want to store in Saving account:->");
		System.out.println("***************************************************************");
		double amount=s.nextDouble();
		double Deposit= 2000;
		double balance= Deposit+amount;
		System.out.println("***************************************************************");
		System.out.println("Balance in account:->"+balance);
		System.out.println("***************************************************************");
		System.out.print("$$$Enter 1 if you want to withdraw the money$$$:->>>");
		int yes=s.nextInt();
		if(yes==1)
		{
		System.out.println("Enter amount you want to widthdraw :->");
		 double withdraw=s.nextDouble();
		 
        // Use a try block with two catch block	//	 
		try{
			if(withdraw>balance)
		   {
			throw new InsufficientBalanceException();
		   }
			else if(withdraw<0) 
			{
			throw new IllegalBankTransactionException();
			
		    } 
		else {
			balance=balance-withdraw;
			System.out.println("*******************Amount is withdrawl*************************");
			System.out.println("THANKYOU******************FOR***********************TRANSACTION");
			System.out.println("After withdraw Current balance is:->"+balance);
		}
		}catch (InsufficientBalanceException e){
			System.out.println("InsufficientBalance in the Account");
            throw new InsufficientBalanceException();
		}catch(IllegalBankTransactionException e) {
			System.out.println("YOUR TRANSACTION IS ILLEGAL OR NOT VALID");
			throw new IllegalBankTransactionException();
		}
		}
	}
 }

