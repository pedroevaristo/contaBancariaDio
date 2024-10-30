package Model.Account;

public class CurrentAccount  {
    private Long id;
    private Double balance;
    private Double cash_handling;
    private IAccount current_functions;

    public CurrentAccount(Double balance, Double cash_handling) {
        this.balance = balance;
        this.cash_handling = cash_handling;
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
