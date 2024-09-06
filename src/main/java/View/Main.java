package View;
import java.util.Scanner;
import Model.AccountClientInformation;
public class Main {
    public static void main(String[] args) {
         AccountClientInformation ACI = new AccountClientInformation();
        Scanner scan = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Banco Dio\n 1- Criar a conta \n 2-Entrar na conta");
        Integer choice = scan.nextInt();
        switch(choice){
            case 1 :
                ACI.createNewAccount();
                break;

            case 2 :
                break;
        }



    }
}