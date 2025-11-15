package com.mycompany.atividadegrasp;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um pedido feito no restaurante.
 *
 * aqui entra o padrão GRASP "Creator":
 * A classe "Pedido" é responsável por criar instâncias de "ItemPedido" porque:
 *
 * 1. Ela agrega vários "ItemPedido".
 * 2. Ela possui os dados necessários para criar esses itens: ItemCardapio e quantidade.
 * 3. O princípio Creator recomenda que uma classe que contém ou usa
 *    fortemente outra classe deve ser a responsável por criá-la.
 *
 * Isso reduz o acoplamento e mantém a responsabilidade no lugar natural
 * do domínio.
 */
public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemCardapio item, int quantidade) {
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
