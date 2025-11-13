package com.mycompany.atividadegrasp;

/**
 * classe que representa um item dentro de um pedido.
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
