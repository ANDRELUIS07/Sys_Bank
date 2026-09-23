package sistemabancario;

// Importa a classe Scanner, utilizada para receber dados do teclado.
import java.util.Scanner;

/**
 * Protótipo de interface via Terminal
 */

// Classe responsável por exibir o menu e receber as opções do usuário.
public class Menu {

    // Cria um objeto Scanner para ler as entradas do teclado.
    private Scanner scanner = new Scanner(System.in);

    //Metodo responsável por iniciar o sistema bancário.
    public void start() {

        // Variável que armazenará a opção escolhida pelo usuário.
        int option;

        // Loop do-while: executa o menu pelo menos uma vez
        // e continua enquanto a opção escolhida não for 9.
        do {

            // Exibe o cabeçalho do sistema.
            System.out.println("============================");
            System.out.println("      Sistema Bancário     ");
            System.out.println("============================");

            // Exibe as opções disponíveis no sistema.
            System.out.println("1) Cadastrar");
            System.out.println("2) Abrir Conta Corrente ");
            System.out.println("3) Abrir Conta Poupança");
            System.out.println("4) Depositar");
            System.out.println("5) Sacar");
            System.out.println("6) Transferir");
            System.out.println("7) Consultar Saldo");
            System.out.println("8) Listar todas as contas");
            System.out.println("9) Sair");
            System.out.println("============================");

            // Solicita ao usuário que escolha uma opção.
            System.out.print("> ");

            // Lê um número inteiro digitado pelo usuário.
            option = scanner.nextInt();

            // Consome a quebra de linha que ficou no Scanner
            // após a leitura do número.
            scanner.nextLine();

            // Estrutura responsável por executar uma ação
            // de acordo com a opção escolhida.
            switch (option) {

                // Caso o usuário escolha 9, exibe uma mensagem
                // informando que o sistema será encerrado.
                case 9 -> System.out.println("Encerrando ...");

                // Caso escolha qualquer outra opção,
                // exibe uma mensagem de opção inválida.
                default -> System.out.println("Opção inválida!");
            }

        } while (option != 9); // Continua executando até o usuário escolher 9.
    }
}