package com.mycompany.atividadegrasp;

/**
 * Classe que representa um item dentro de um pedido.
 *
 * Aqui também não há aplicação direta de um padrão GRASP.
 * Ela faz parte das entidades de negócio e funciona como
 * "objeto parte" dentro de um Pedido.
 */
public class ItemPedido {
    private ItemCardapio itemCardapio;
    private int quantidade;

    public ItemPedido(ItemCardapio itemCardapio, int quantidade) {
        this.itemCardapio = itemCardapio;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return itemCardapio.getPreco() * quantidade;
    }

    public String getDescricao() {
        return quantidade + "x " + itemCardapio.getNome() + " = R$" + calcularSubtotal();
    }
}
