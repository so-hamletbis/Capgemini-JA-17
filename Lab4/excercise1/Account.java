package excercise1;

public class Account extends Personal {
	
	private long accNum;
    private double balance;

    //  Methods
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }

    //  Getters
    public long getAccNum() {
        return accNum;
    }

    //  Setters
    public void setAccNum(long newAccNum) {
        this.accNum = newAccNum;
    }
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

}
