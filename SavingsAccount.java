
public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            transactions.add(new Transaction("WITHDRAW", amount));
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance! Minimum balance must be maintained.");
        }
    }
}
