package test.arsinspace.bank.bankCards;

public class DebitCard extends BankCard{

    public DebitCard() {
    }

    public DebitCard(double ownFunds) {
        this.ownFunds = ownFunds;
    }

    private double ownFunds;
    @Override
    public void deposit(double amount) {
        if (amount > 0) ownFunds += amount;
    }

    @Override
    public boolean pay(double amount) {
        if (ownFunds - amount >= 0){
            ownFunds -= amount;
            return true;
        } else return false;
    }

    @Override
    public double getBalance() {
        return ownFunds;
    }

    @Override
    public String getInfoAboutAvailableFunds() {
        return "Дебетовая карта" + "\n" + "Собственные средства: " + ownFunds;
    }
}
