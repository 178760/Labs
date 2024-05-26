/*Implement a bank account class showing method overloading with methods for deposit, withdrawal and balance inquiry.Use method overloading to handle 
different types of transactions */

class BankAccount                //class name
{
    double balance;               //member variable
    public BankAccount(double initialBalance)     //constructor
	{
	 balance=initialBalance;
	}
    void transaction(double amount)              
	{
	 balance=balance+amount;
	 System.out.println("Deposited "+amount);  //print deposted amount
	}
	  void transaction(double amount,boolean withdrawal )              
	{
	 balance=balance-amount;
	 System.out.println("Withdrawal "+amount);    //print Withdrawal amount
	}
	void transaction()              
	{
	 System.out.println("Current balance: "+balance);    //print Current balance
	}
}
class BankAccountDemo           
{
  public static void main(String args[]) //main method
  {
    BankAccount b1=new BankAccount(100); // created instance of bankaccount
	b1.transaction(500);                 //perform transaction of depositing 500
	b1.transaction();                    //print current balance
  }
}
    
