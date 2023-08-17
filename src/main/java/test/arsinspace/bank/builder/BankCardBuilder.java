package test.arsinspace.bank.builder;

import test.arsinspace.bank.bankCards.BankCard;
import test.arsinspace.bank.rewards.CashBackReward;
import test.arsinspace.bank.rewards.DepositBonusReward;

public class BankCardBuilder {
    private BankCard bankCard;

    public BankCardBuilder(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public BankCardBuilder withCashBack(){
        bankCard = new CashBackReward(bankCard);
        return this;
    }

    public BankCardBuilder withDepositBonus(){
        bankCard = new DepositBonusReward(bankCard);
        return this;
    }

    public BankCard build(){
        return bankCard;
    }
}
