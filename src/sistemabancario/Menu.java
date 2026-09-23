package sistemabancario;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    public void start() {
        int option;

        do{
            System.out.println("============================");
            System.out.println("      Sistema Bancário     ");
            System.out.println("============================");

            System.out.println("1) Cadastrar");
            System.out.println("2) Abrir Conta Corrente ");
            System.out.println("3) Abrir Conta Poupança");
            System.out.println("4) Depositar");
            System.out.println("5) Sacar");
            System.out.println("6) Transferir");
            System.out.println("7) Consultar Saldo");
            System.out.println("8) Listar todas as contas");
            System.out.println("9) Sair");
            System.out.println(">");
            option = scanner.nextInt();
        } while(option != 9);
    }

}
