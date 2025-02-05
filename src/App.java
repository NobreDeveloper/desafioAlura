import java.util.Scanner;

import services.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Client novoClient = new Client("Pablo Nobre", "Corrente", 2500.00);
        String status = novoClient.status();
        int controller = 0;
        System.out.println(status);
        
        while (controller != 4){
            System.out.println("""
                    Operações

                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair

                    Digite a opção desejada:
                    """);
            controller = scanner.nextInt();
            switch (controller) {
                case 1:
                    System.out.println("Saldo atual: " + novoClient.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser recebido:");
                    double valorRecebido = scanner.nextDouble();
                    novoClient.receberValor(valorRecebido);
                    System.out.println("Novo saldo: " + novoClient.getSaldo());
                case 3:
                    System.out.print("Digite o valor a ser transferido:");
                    double valorTransferido = scanner.nextDouble();
                    novoClient.transferirValor(valorTransferido);
                    System.out.println("Novo saldo: " + novoClient.getSaldo());
                
                default:
                    break;
            }
        }
        scanner.close();
    }
}
/*Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: */