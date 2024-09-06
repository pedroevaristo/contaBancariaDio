package Model;

public class InvestimentAccount {
    private BankingData bank_d;
    private Double available_balance;// valor a ser investido
    private Double

    public InvestimentAccount(BankingData bank_d, Double available_balance,Double value_to_invest) {
        this.bank_d = bank_d;
        this.available_balance = available_balance;
    }

    public BankingData getBank_d() {
        return bank_d;
    }


    public Double getAvailable_balance() {
        return available_balance;
    }

    public InvestimentAccount setAvailable_balance(Double available_balance) {
        this.available_balance = available_balance;
        return this;
    }




}
