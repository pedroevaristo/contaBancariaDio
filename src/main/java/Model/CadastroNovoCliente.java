package Model;
//DAO
public class CadastroNovoCliente {
    private String name_complete;
    private String cpf;
    private String email;
    private String password;
    //Gerar duas contas corrente e poupança/ investimento


    public CadastroNovoCliente(String name_complete, String cpf, String email, String password) {
        this.name_complete = name_complete;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
    }

    public String getName_complete() {
        return name_complete;
    }

    public void setName_complete(String name_complete) {
        this.name_complete = name_complete;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
