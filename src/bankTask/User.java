package bankTask;

public class User {
  private String name ;
  private double balanceAmount;
  public User(String name, double balanceAmount) {
	  this.name= name;
	  this.balanceAmount=balanceAmount;
  }
  
   public double getAccountBalance() {
	   return balanceAmount;
   }
   
   public void deposit(double amount) {
	  balanceAmount +=amount;
	  System.out.println("Deposited: " + amount +" , your current balance : "+balanceAmount);
  }
  
   
  public void withdraw(double amount) {
	  if(amount<=balanceAmount) {
		  balanceAmount-=amount;
		  System.out.println("Withdrawn: " + amount+" , your current balance : "+balanceAmount);
	  }
	  else{
		  System.out.println(" Withdrawal failed ,your balance is not enough");
	  }
	  
  }
  
  
  public void checkBalance() {
	  System.out.println("Your balance : "+balanceAmount);
  } 
  
}
