package Controller;

import Model.BankingData;

public class InvestimentAccount extends BankingData {
    private Double value_to_invest;// valor a ser investido
    public InvestimentAccount(Integer bank_number, Integer bank_Agency, String bank_Name) {
        super(bank_number, bank_Agency, bank_Name);
        this.value_to_invest = value_to_invest;
    }

    public Double getValue_to_invest() {
        return value_to_invest;
    }

    public InvestimentAccount setValue_to_invest(Double value_to_invest) {
        this.value_to_invest = value_to_invest;
        return this;
    }
}
