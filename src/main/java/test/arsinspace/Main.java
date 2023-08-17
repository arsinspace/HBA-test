package test.arsinspace;

import test.arsinspace.bank.bankCards.BankCard;
import test.arsinspace.bank.bankCards.CreditCard;
import test.arsinspace.bank.bankCards.DebitCard;
import test.arsinspace.bank.builder.BankCardBuilder;

public class Main {
    public static void main(String[] args) {
        BankCard creditBankCard = new BankCardBuilder(new CreditCard(10000,10000,0))
                .withCashBack()
                .withDepositBonus()
                .build();

        creditBankCard.deposit(10000);
        creditBankCard.pay(5000);

        System.out.println(creditBankCard.getBalance());
        System.out.println(creditBankCard.getInfoAboutAvailableFunds());
        System.out.println();

        BankCard debitBankCard = new BankCardBuilder(new DebitCard(0))
                .withCashBack()
                .withDepositBonus()
                .build();

        debitBankCard.deposit(10000);
        debitBankCard.pay(5000);

        System.out.println(debitBankCard.getBalance());
        System.out.println(debitBankCard.getInfoAboutAvailableFunds());
    }
}