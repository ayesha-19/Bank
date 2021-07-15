package bank;
import java.util.*;

public class BankingApplication 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount("Ayesha","ET5011");
		ba.showMenu();

	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	void deposit(int amount)
	{
		if (amount != 0)
		{
			balance=balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited " +previousTransaction);
		}
		else if (previousTransaction < 0)
		{
			System.out.println("Withdrawn "+Math.abs(previousTransaction));
			
		}
		else
		{
			System.out.println("No transaction Occured");
		}
	}
	
	void showMenu()
	{
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Our Bank "+customerName);
		System.out.println("Your ID is  "+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance ");
		System.out.println("B. Deposit ");
		System.out.println("C. Withdraw ");
		System.out.println("D. Previous transaction ");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("============================================");
			System.out.println("Enter an option");
			System.out.println("============================================");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("-------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("-------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("-------------------------");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("-------------------------");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("-------------------------");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("-------------------------");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("-------------------------");
				getPreviousTransaction();
				System.out.println("-------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("***************************************");
				
				
			default:
				System.out.println("Invalid Option!!! Please Try again");
				break;
			
				
				
			}
			
		}while(option != 'E');
		System.out.println("Thank You for Using Services");
		
	}
}

