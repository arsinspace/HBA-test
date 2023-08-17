package test.arsinspace.bank.bankCards;

public abstract class BankCard {

    private double balance;

    public BankCard() {
    }

    public abstract void deposit(double amount);
    public abstract boolean pay(double amount);
    public abstract double getBalance();
    public abstract String getInfoAboutAvailableFunds();
}
