package excercise1;

public class CurretAcc extends Account{
	private double overdraftLimit = getBalance();

    @Override
    public void withdraw(double amount) {
        if (amount < getBalance())
            super.withdraw(amount);
        else
            System.out.println("Overdraft limit reached");
    }


}
