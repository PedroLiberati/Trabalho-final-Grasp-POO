package com.mycompany.atividadegrasp;

/**
 * classe responsável por controlar o fluxo do sistema
 * 
 * Padrão grasp aplicado: controller
 * - essa classe atua como intermediária entre a interface (usuário)
 *   e as classes de domínio (Pedido, ItemCardapio, e etc)
 * - ela coordena as ações do sistema e mantem baixa dependência
 *   entre a camada de interface e as classes de negócio
 */
public class PedidoController {
    private final Pedido pedido;

    public PedidoController() {
        pedido = new Pedido(); // cria um novo pedido
    }

    public void adicionarItemAoPedido(ItemCardapio item, int quantidade) {
        pedido.adicionarItem(item, quantidade);
    }

    public void finalizarPedido() {
        pedido.exibirResumo();
    }
}
