package View;

import java.util.Scanner;

public class AcessAccount {
    public void acessToBank() {
        Scanner scan = new Scanner(System.in);
        int loopp = 1;
        do {

            System.out.println("Bem-vindo ao banco prog\n Selecione as opções abaixo:\n 1 -Criar um conta-Depositar\n 2-Fazer saque\n 3-extrato bancario\n 4-transferir entre contas");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    //System.out.println("Entrou no case 1");
                    break;
                case 2:
                    //System.out.println("Entrou no case 2");
                    break;
                case 3:
                    //System.out.println("Entrou no case 3");
                    break;
                case 4:
                    //System.out.println("Entrou no case 4");
                    break;
                default:
                    //System.out.println("Entrou no case default");
                    break;

            }
        } while (loopp != 0);
    }
}
