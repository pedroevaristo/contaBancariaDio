package Controller;

import Model.BankingData;

public class CurrentAccount extends BankingData {
    private Double cash_handling;

    public CurrentAccount(Integer bank_number, Integer bank_Agency, String bank_Name) {
        super(bank_number, bank_Agency, bank_Name);
        this.cash_handling = cash_handling;
    }

    public Double getCash_handling() {
        return cash_handling;
    }

    public CurrentAccount setCash_handling(Double cash_handling) {
        this.cash_handling = cash_handling;
        return this;
    }
}
