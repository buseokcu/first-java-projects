package hello;

import java.util.Scanner;

public class atm {

	//ich möchte eine ATM Machine machen //
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// bir şifre ve account number olsun
		// doğru girerse girebilir
		// 2 account 1 çıkma
		// type 1-2-3-4
		// para çekme para yatırma ama bakiyesini geçemez
		
	   String acc = "8901234";
	   String pass = "123456";
	   
	   int chacc = 2000;
       int savacc = 3000;
	  
	   System.out.println("Enter Your Account Number: " );
	   String fakeacc = scan.nextLine();
	   System.out.println("Enter Your Password: " );
	   String fakepass = scan.nextLine();
	   
	   if (((acc.equals(fakeacc)) && (pass.equals(fakepass)))) {
		   
		 System.out.println("Succesfull...");  
		 System.out.println("Select the Account: ");
	     System.out.println("Type 1: Checking Account");
	     System.out.println("Type 2: Saving Account");
	     System.out.println("Type 3: Exit");
	     
	     int select = scan.nextInt();
	     
	     switch (select) {
	     
	     //Checking Acc
	     
	     case 1 :
	    	 System.out.println("Checking Account: ");
	    	 System.out.println("Type 1: View Balance");  
			 System.out.println("Type 2: Withdraw Funds");
		     System.out.println("Type 3: Deposit Funds");
		     System.out.println("Type 4: Exit");
		     
		     int checking = scan.nextInt();
		     
		     switch (checking) {
		     
		     case 1 :
		    	 System.out.println("Checking Account Balance: " + chacc );
		    
		    	 break;
		    	 
		     case 2 : 
		    	 
		    	 System.out.println("Checking Account Balance: " + chacc );
		    	 
		    	 System.out.println("Amount you want to withdraw from Checking Account: " );
		    	 int c = scan.nextInt();
		    	 
		    	 if ((chacc-c) >=0) {
		    		 
		    		 int newchacc = (chacc-c);
		    		 
		    		 System.out.println("New Checking Account Balance: " + newchacc );
		    		 
		    	 }
		    	 else {
		    		 System.out.println("Insufficient Balance");
		    	 }
		    	 
		    	 break;
		    	 
		     case 3 :
		    	 
		    	 System.out.println("Checking Account Balance: " + chacc );
		    	 
		    	 System.out.println("Amount you want to deposit from Checking Account: " );
		    	 int v = scan.nextInt();
		    	 
		    	 if ((chacc+v) >= 0) {
		    		 
		    		 int newchacc = (chacc+v);
		    		 
		    		 System.out.println("New Checking Account Balance: " + newchacc );
		    		 
		    	 }
		    	 else {
		    		 System.out.println("Negative Balanc is invalid.");
		    	 }
		    	 
		    	 break;
		    	 
		     case 4: 
		    	 
		    	 System.out.println("Thanks for using ATM :)");
		    	
		     }
	     
		     break;
		     
		     //Saving Acc
		     
	     case 2 : 
		     
	    	 System.out.println("Saving Account: ");
	    	 System.out.println("Type 1: View Balance");  
			 System.out.println("Type 2: Withdraw Funds");
		     System.out.println("Type 3: Deposit Funds");
		     System.out.println("Type 4: Exit");
		     
		     int saving = scan.nextInt();
		     
		     switch (saving) {
		     
		     case 1 :
		    	 System.out.println("Checking Account Balance: " + savacc );
		    
		    	 break;
		    	 
		     case 2 : 
		    	 
		    	 System.out.println("Checking Account Balance: " + savacc );
		    	 
		    	 System.out.println("Amount you want to withdraw from Checking Account: " );
		    	 int c = scan.nextInt();
		    	 
		    	 if ((savacc-c) >=0) {
		    		 
		    		 int newsavacc = (savacc-c);
		    		 
		    		 System.out.println("New Checking Account Balance: " + newsavacc );
		    		 
		    	 }
		    	 else {
		    		 System.out.println("Insufficient Balance");
		    	 }
		    	 
		    	 break;
		    	 
		     case 3 :
		    	 
		    	 System.out.println("Checking Account Balance: " + savacc );
		    	 
		    	 System.out.println("Amount you want to deposit from Checking Account: " );
		    	 int v = scan.nextInt();
		    	 
		    	 if ((savacc+v) >= 0) {
		    		 
		    		 int newsavacc = (savacc+v);
		    		 
		    		 System.out.println("New Checking Account Balance: " + newsavacc );
		    		 
		    	 }
		    	 else {
		    		 System.out.println("Negative Balance is invalid.");
		    	 }
		    	 
		    	 break;
		    	 
		     case 4: 
		    	 
		    	 System.out.println("Thanks for using ATM :)");
		    	
		     }
		    
		     break;
		     
	     case 3 :
	    	 
	    	 System.out.println("Thanks for using ATM :)");
		    
	     }
	     
	
	   }
	
	   else {
		   
		   System.out.println("Account Number/Password is incorrect");
	   }
	  
	}
	
	
}
