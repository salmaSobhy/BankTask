package bankTask;
/*
 * pass 1234
 * 
 * */
import java.util.Scanner;

public class bankSystem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name ="salma",password ="1234";
		
	   User user1 = new User(name,10000);
	     System.out.println("Welcome to our bank ***");
	     System.out.print("Enter your password :: ");
  	      String pass = in.next();
  	      int f=0;
  	   if(  pass.equals(password))
  		    System.out.println("welcome " +name);
  	 else {
		   System.out.println("Invalid password try again ......");
		   return  ;
	   }
  		   
	       while(true) {
	    	  
	    	  {
	    		   System.out.println("1.DEPOSIT :");
	    		   System.out.println("2.Withdraw :");
	    		   System.out.println("3-Check balance :");
	    		   System.out.println("4-Calculate interest :");
	    		   System.out.println("5-exit");
	    	       System.out.println("-------------------------------------------");
	    	       System.out.print("enter your choice : ");
	    		   int choice=in.nextInt();
	    		   double amount =0;
	    		   switch(choice) {
	    		   case 1:
		    	     System.out.print("enter amount :");
		    	     amount  = in .nextDouble();
		    	     user1.deposit(amount);
		    	       System.out.println("-------------------------------------------");
		    	     break;
	    		   case 2 :  
	    			  System.out.print("enter amount to withdraw : ");
			    	  amount  = in .nextDouble();
			    	  user1.withdraw(amount);
		    	       System.out.println("-------------------------------------------");
			    	  break;
	    		   case 3 :  
				    	  user1.checkBalance();
			    	       System.out.println("-------------------------------------------");
				    	  break;
	    		   case 4 :  
		    			 calcInterest calculate = new calcInterest();
		    			double interest = calculate.calculateInterest(user1.getAccountBalance());
		    			System.out.println("interest : "+interest);
			    	       System.out.println("-------------------------------------------");
				    	  break; 	
	    		   case 5:
	    			   return ;

	    		   }
	    	   }
	    	   
	       }
	}
	}

