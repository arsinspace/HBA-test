package test.arsinspace.bank.bankCards;

public class CreditCard extends BankCard{

    private double creditLimit;
    private double creditFunds;
    private double ownFunds;

    public CreditCard() {
    }

    public CreditCard(double creditLimit, double creditFunds, double ownFunds) {
        this.creditLimit = creditLimit;
        this.creditFunds = creditFunds;
        this.ownFunds = ownFunds;
    }

    @Override
    public void deposit(double amount) {
        double isOverLimit = creditFunds + amount;
        if (isOverLimit > creditLimit){
            creditFunds = creditLimit;
            ownFunds += isOverLimit - creditLimit;
        }
        else if (isOverLimit < creditLimit) creditFunds = isOverLimit;
        else ownFunds += amount;
    }

    @Override
    public boolean pay(double amount) {
        if (creditFunds + ownFunds < amount) return false;

        double residualAmount = ownFunds - amount;
        if (residualAmount < 0) {
            ownFunds = 0;
            creditFunds += residualAmount;
        }
        else ownFunds -= amount;
        return true;
    }

    @Override
    public String getInfoAboutAvailableFunds() {
        return "Кредитная карта с лимитом " + creditLimit + "\n" +
                "Кредитные средства: " + creditFunds + "\n" +
                "Собственные средства: " + ownFunds;
    }

    @Override
    public double getBalance() {
        return creditFunds + ownFunds;
    }
}
