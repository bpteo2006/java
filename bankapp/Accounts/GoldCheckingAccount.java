package bankapp.Accounts;

public class GoldCheckingAccount extends CheckingAccount {
    public GoldCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    public int calculateRewardPoints(double cost) {
        return (int) (Math.min(cost, 4000) * 50);       
    }
}
