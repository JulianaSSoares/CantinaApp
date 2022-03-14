import entity.*;

import java.util.Scanner;

public class CantinaApplication {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        cantina.exibeCardapio();

        do {
                cantina.adicionaItensPedido(scanner.nextLine());
                System.out.println("Deseja adicionar mais itens?\nEscolha 1 - SIM / 2 - NÃO / 0 - ENCERRAR");
                opcao = scanner.nextInt();
                if (opcao == 1) {
                    System.out.println("Informe o nome do prato ou bebida:");
                    //scanner.nextLine();
                    cantina.adicionaItensPedido(scanner.nextLine());
                    System.out.println("Deseja adicionar mais itens?\nEscolha 1 - SIM / 2 - NÃO / 0 - ENCERRAR");
                    opcao = scanner.nextInt();
                    cantina.adicionaItensPedido(scanner.nextLine());
                } else if (opcao == 2) {
                    cantina.exibePedido();
                    System.out.println("Taxa de entrega: " + cantina.calculaTaxaEntrega());
                    System.out.println("Valor total do pedido: " + cantina.calculaValorTotalPedido());
                } else if (opcao == 0) {
                    System.exit(0);
                }
        } while (opcao != 0);
    }
}