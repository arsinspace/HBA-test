package test.arsinspace.bank.rewards;

import test.arsinspace.bank.bankCards.BankCard;

public abstract class Rewards extends BankCard {

    protected BankCard bankCard;

    public Rewards(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public void deposit(double amount) {
        bankCard.deposit(amount);
    }

    @Override
    public boolean pay(double amount) {
        return bankCard.pay(amount);
    }

    @Override
    public String getInfoAboutAvailableFunds() {
        return bankCard.getInfoAboutAvailableFunds();
    }

    @Override
    public double getBalance() {
        return bankCard.getBalance();
    }
}
