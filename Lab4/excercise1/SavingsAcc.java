package excercise1;

public class SavingsAcc extends Account {
	final private int minimumBalance = 500;

	@Override
	public void withdraw(double amount) {
	    if (amount < minimumBalance)
	        super.withdraw(amount);
	    else
	        System.out.println("Balance is low!");
	}
	
}