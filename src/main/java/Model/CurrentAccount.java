package Model;
import Controller.ICurrent;

public class CurrentAccount implements ICurrent {
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
    //implementação dos metodos da interface Icurrent
    @Override
    public void withdrawal(Double amount) {
        if(amount < balance ){
            balance -= amount;
            System.out.println("Valor sacado");
        }else{
            System.out.println("Valor não pode ser sacado o dinheiro do caixa");
        }
    }

    @Override
    public void deposit(Double amount) {
        balance += amount;
        System.out.println("Depositado");
    }

    @Override
    public void transfer_between_accounts(ICurrent allocate_account, Double amount) {
        if(amount <= balance){// como vou apontar para a conta de investimentos ? (no caso InvestimentAccount)
            System.out.println("");
        }else{
            System.out.println("");
        }
    }
}
