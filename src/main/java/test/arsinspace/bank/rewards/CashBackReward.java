package test.arsinspace.bank.rewards;

import test.arsinspace.bank.bankCards.BankCard;

public class CashBackReward extends Rewards{

    public CashBackReward(BankCard bankCard) {
        super(bankCard);
    }

    @Override
    public boolean pay(double amount) {
        if (super.pay(amount)) {
            super.deposit(amount * 0.1);
            return true;
        }
        return false;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public String getInfoAboutAvailableFunds() {
        return super.getInfoAboutAvailableFunds() + "\n" + "Бонусная программа: " +
            "Кешбек 10% при покупках";
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
