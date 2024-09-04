package View;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loopp = 1;

        do {

            System.out.println("Bem-vindo ao banco prog\n Selecione as opções abaixo:\n 1 -Depositar\n 2-Fazer saque 3-extrato bancario\n 4-transferir entre contas");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Double deposit_money= scan.nextDouble();
                    scan.nextLine();
                    DepositoDinheiro.depositMoneyInAccount(deposit_money);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;

            }
        }while(loopp != 0);

    }
}