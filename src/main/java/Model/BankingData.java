package Model;
//DAO
public class BankingData {
    protected Integer bank_number;
    protected Integer bank_agency;
    protected String bank_name;

    public BankingData(Integer bank_number, Integer bank_agency, String bank_name) {
        this.bank_number = bank_number;
        this.bank_agency = bank_agency;
        this.bank_name = bank_name;
    }

    public Integer getBank_number() {
        return bank_number;
    }

    public Integer getBank_agency() {
        return bank_agency;
    }

    public String getBank_name() {
        return bank_name;
    }
}



