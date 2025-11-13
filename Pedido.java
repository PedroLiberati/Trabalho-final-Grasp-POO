package com.mycompany.atividadegrasp;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um pedido feito no restaurante.
 * 
 * Padrão grasp aplicado no creator
 * - a classe Pedido vai ser responsável por criar instâncias de ItemPedido,
 *   pois ela "contem" esses objetos e possui as informações necessárias
 *   para criar (item e quantidade).
 */
public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemCardapio item, int quantidade) {
        // Aplicação do padrão creator: pedido cria seus próprios itens.
        ItemPedido novoItem = new ItemPedido(item, quantidade);
        itens.add(novoItem);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("Resumo do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item.getDescricao());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
