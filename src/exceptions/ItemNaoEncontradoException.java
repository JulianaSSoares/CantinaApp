package exceptions;

public class ItemNaoEncontradoException extends Exception {

    public ItemNaoEncontradoException(String mensagem) {
        super(mensagem);
        final String MENSAGEM_ITEM_NAO_ENCONTRADO = "Item Não Encontrado!";
        System.out.println(MENSAGEM_ITEM_NAO_ENCONTRADO);
    }
}
