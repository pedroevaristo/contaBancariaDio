package Model.Account;

public class InvestimentAccount {
    private Long id;
    private Double balance_invested;
    private Double available_balance;// valor a ser investido

    public InvestimentAccount(Double balance_invested, Double available_balance) {
        this.balance_invested = balance_invested;
        this.available_balance = available_balance;
    }

    public Double getBalance_invested() {
        return balance_invested;
    }

    public InvestimentAccount setBalance_invested(Double balance_invested) {
        this.balance_invested = balance_invested;
        return this;
    }

    public Double getAvailable_balance() {
        return available_balance;
    }

    public InvestimentAccount setAvailable_balance(Double available_balance) {
        this.available_balance = available_balance;
        return this;
    }
}
