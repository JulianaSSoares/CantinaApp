package enums;

public enum CardapioEnum {

    BURGER("Burguer"),
    PIZZA("Pizza"),
    FOGAZZA("Fogazza"),
    PASTA("Pasta"),
    LASANHA("Lasanha"),
    POLPETONE("Polpetone"),
    REFRIGERENTE("Refrigerante"),
    SUCO("Suco"),
    VINHO("Vinho");

    private String descricao;

    CardapioEnum(String descricao) {this.descricao = descricao; }

    public String getDescricao() { return this.descricao; }

}