package bankTask;

public class calcInterest implements interestCalculation {
	@Override
	public double calculateInterest(double balance) {
		
		return balance *0.07;
	}

}
