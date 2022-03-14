package entity;

import exceptions.ItemNaoEncontradoException;
import interfaces.ITaxaEntrega;

import java.util.ArrayList;

public class Cantina implements ITaxaEntrega {

    private ArrayList<String> pratosPedido = new ArrayList<>();
    private String[] cardapioCantina = {"BURGUER", "PIZZA", "FOGAZZA", "PASTA", "LASANHA", "POLPETONE",
            "REFRIGERANTE", "SUCO", "VINHO"};
    private int[] precoCantina = {30, 45, 20, 30, 70, 50, 5, 7, 50};
    private int taxaEntregaTotal;
    protected final int TAXA_ENTREGA_LANCHE_E_BEBIDA = 1;
    protected final int TAXA_ENTREGA_COMIDA = 2;
    private int valorCompra = 0;

    public void exibeCardapio() {
        System.out.println("Seja bem Vindo à Cantina Codifichiamo\n" +
                "\nCARDAPIO:" +
                "\nLanches\n" +
                "- Burguer      - $30\n" +
                "- Pizza        - $45\n" +
                "- Fogazza      - $20\n" +
                "\nComida\n" +
                "- Pasta        - $30\n" +
                "- Lasanha      - $70\n" +
                "- Polpetone    - $50\n" +
                "\nBebidas\n" +
                "- Refrigerante - $5\n" +
                "- Suco         - $7\n" +
                "- Vinho        - $50" +
                "\n\nFaça sua escolha digitando o nome do prato ou da bebida:");

    }

    public void adicionaItensPedido(String itemPedido) {
        for (int i = 0; i < cardapioCantina.length; i++) {
//            if (getPratosPedido().contains(cardapioCantina[i])) {
                this.pratosPedido.add(itemPedido.toUpperCase());
//            } else {
//                System.out.println("Item não encontrado");
//            }
        }
    }

    public void exibePedido() {
        System.out.println("Resumo do Pedido:");
        for (int i = 0; i < cardapioCantina.length; i++) {
            if (getPratosPedido().contains(cardapioCantina[i])) {
                valorCompra += precoCantina[i] + taxaEntregaTotal;
                System.out.println(cardapioCantina[i] + " " + precoCantina[i]);
            }
        }
    }

    @Override
    public int calculaTaxaEntrega() {
        for (int i = 0; i < cardapioCantina.length; i++) {
            if (getPratosPedido().contains(cardapioCantina[i]) && i <= 2
                    || getPratosPedido().contains(cardapioCantina[i]) && i >= 6) {
                taxaEntregaTotal += TAXA_ENTREGA_LANCHE_E_BEBIDA;
            } else if (getPratosPedido().contains(cardapioCantina[i]) && i > 2
                    || getPratosPedido().contains(cardapioCantina[i]) && i < 6) {
                taxaEntregaTotal += TAXA_ENTREGA_COMIDA;
            }
        }
        return taxaEntregaTotal;
    }

    public int calculaValorTotalPedido() {
        return taxaEntregaTotal + valorCompra;
    }

    public ArrayList<String> getPratosPedido() {
        return pratosPedido;
    }
    public String[] getCardapioCantina() {
        return cardapioCantina;
    }
}