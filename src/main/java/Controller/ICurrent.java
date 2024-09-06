package Controller;

public interface ICurrent {//usando strategy
    void withdrawal(Double amount);
    void deposit(Double amount);
    void transfer_between_accounts(ICurrent allocate_account, Double amount);

}
