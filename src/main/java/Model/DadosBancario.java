package Model;
//DAO
public class DadosBancario {
    private Double currency;
    private String current_account;
    private String savings_account;//ou investimentos

    public DadosBancario(Double currency, String current_account, String savings_account) {
        this.currency = currency;
        this.current_account = current_account;
        this.savings_account = savings_account;
    }

    public Double getCurrency() {
        return currency;
    }

    public void setCurrency(Double currency) {
        this.currency = currency;
    }

    public String getCurrent_account() {
        return current_account;
    }

    public void setCurrent_account(String current_account) {
        this.current_account = current_account;
    }

    public String getSavings_account() {
        return savings_account;
    }

    public void setSavings_account(String savings_account) {
        this.savings_account = savings_account;
    }
}
