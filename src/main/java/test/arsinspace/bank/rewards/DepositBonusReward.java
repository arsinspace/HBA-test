package test.arsinspace.bank.rewards;

import test.arsinspace.bank.bankCards.BankCard;

public class DepositBonusReward extends Rewards{


    public DepositBonusReward(BankCard bankCard) {
        super(bankCard);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 1000) {
            super.deposit(100);
            super.deposit(amount);
        }
        else super.deposit(amount);
    }

    @Override
    public boolean pay(double amount) {
        return super.pay(amount);
    }

    @Override
    public String getInfoAboutAvailableFunds() {
        return super.getInfoAboutAvailableFunds() + "\n" + "Бонусная программа: " +
                "Пополнение баланса на 100 при депозите более 1000";
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
