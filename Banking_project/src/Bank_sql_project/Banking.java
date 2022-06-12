package Bank_sql_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Banking 
{
 Scanner Scanner_Met() 
 {
	 Scanner s1 =new Scanner(System.in);
	 return s1;
 }
  void	OpenAcc()
  {		
	  	//To take the user name from the user from the console 
	  	System.out.println("Enter the user name:");
		String User_Name = Scanner_Met().nextLine();
		
		//To take the user name from the user from the Account Number 
		System.out.println("Enter the Account Number:");
		String Account_Number = Scanner_Met().nextLine();
		
		// To take the user name from the user from the Date_of_Birth
		System.out.println("Enter the Date_of_Birth:");
		String Date_of_Birth = Scanner_Met().nextLine();
		
		//To take the user name from the user from the Address
		System.out.println("Enter the Address:");
		String Address = Scanner_Met().nextLine();
		
		//To take the user name from the user from the Contact_Number
		System.out.println("Enter the Contact Number:");
		String Contact_Number = Scanner_Met().nextLine();
		
		//To take the user name from the user from the Opening Balance
		System.out.println("Enter the Opening Balance:");
		String Opening_Bal = Scanner_Met().nextLine();
			
  }
  void depoAcc()
  {	
	  //Taking the deposite amount from the user
	  System.out.println("Enter the Deposite Amount:");
	  int amount = Scanner_Met().nextInt();
	  
	  //Taking the Account Number from the user to which he have to deposite
	  System.out.println("Enter the Account Number:");
	  String Account_Number = Scanner_Met().nextLine();
	  
  }
  void WithdrawAmount()
  {
	  //Taking the deposite amount from the user
	  System.out.println("Enter the withdraw Amount:");
	  int amount = Scanner_Met().nextInt();
	  
	  //Taking the Account Number from the user from which he have to withdraw 
	  System.out.println("Enter the Account Number:");
	  String Account_Number = Scanner_Met().nextLine();
  }
  void BalEnq()
  {
	  //Taking the Account Number from the user from which he have to withdraw 
	  System.out.println("Enter the Account Number:");
	  String Account_Number = Scanner_Met().nextLine();
	  
  }
  void DisplayDetails()
  {
	  //Taking the Account Number from the user ,to see the details of that account 
	  System.out.println("Enter the Account Number:");
	  String Account_Number = Scanner_Met().nextLine();
  }
  void CloseAccount()
  {
	  //Taking the Account Number from the user from which he have to withdraw 
	  System.out.println("Enter the Account Number:");
	  String Account_Number = Scanner_Met().nextLine();
  }
  public static void main(String [] args)
  {
	 System.out.println("1.open new account \n2.DepositeAmount \n3.WithDraw Amount \n4.Balance Enquiry \n5.Display Customer details \n"
			 + "6. Close an Account ");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the task you want to perform:");
		int choice = s1.nextInt();//4
		Banking b1 = new Banking();
		if(choice == 1)
		{
			b1.OpenAcc();
		}
		else if(choice == 2)
		{
			b1.depoAcc();
		}
		else if(choice == 3)
		{
			b1.WithdrawAmount();	
		}
		else if(choice == 4)
		{
			b1.BalEnq();
		}
		else if(choice == 5)
		{
			b1.DisplayDetails();	
		}
		else if (choice == 6)
		{
			b1.CloseAccount();
		}
		else
		{
			System.out.println("Please select the above options only");
		}
	}

}
