package Model.User;

import Database.Database;

public class AccountClientInformation {
    private Long id;
    private String name_complete;
    private String cpf;
    private String email;
    private String password;
    //Gerar duas contas corrente e poupança/ investimento


    public AccountClientInformation(Long id_user, String name_complete, String cpf, String email, String password) {

        this.id = id_user;
        this.name_complete = name_complete;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName_complete() {
        return name_complete;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public AccountClientInformation setId(Long id) {
        this.id = id;
        return this;
    }

    public AccountClientInformation setName_complete(String name_complete) {
        this.name_complete = name_complete;
        return this;
    }

    public AccountClientInformation setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public AccountClientInformation setEmail(String email) {
        this.email = email;
        return this;
    }

    public AccountClientInformation setPassword(String password) {
        this.password = password;
        return this;
    }

}
