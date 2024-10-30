package Model.Account;

public interface IAccount {//usando strategy
    void withdrawal(Double amount);
    void deposit(Double amount);
    void transfer_between_accounts(IAccount allocate_account, Double amount);

}
