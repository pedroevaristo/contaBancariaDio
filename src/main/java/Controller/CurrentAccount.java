package Controller;
import Controller.ICurrent;
import Model.BankingData;

public class CurrentAccount  {
    private BankingData bank_d;
    private Double balance;
    private Double cash_handling;
    private ICurrent current_functions;

    public CurrentAccount(BankingData bank_d, Double balance, Double cash_handling) {
        this.bank_d = bank_d;
        this.balance = balance;
        this.cash_handling = cash_handling;
    }

    public BankingData getBank_d() {
        return bank_d;
    }


    public Double getBalance() {
        return balance;
    }

    public CurrentAccount setBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    public Double getCash_handling() {
        return cash_handling;
    }

    public CurrentAccount setCash_handling(Double cash_handling) {
        this.cash_handling = cash_handling;
        return this;
    }

}
