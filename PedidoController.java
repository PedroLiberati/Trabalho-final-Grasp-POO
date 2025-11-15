package com.mycompany.atividadegrasp;

/**
 * Classe responsável por controlar o fluxo do sistema.
 *
 * Aqui entra o padrão GRASP "Controller":
 * Esta classe atua como o "ponto central de entrada" para operações do sistema.
 *
 * Por que esta classe atende ao GRASP Controller:
 * - Ela representa um caso de uso ("gerenciar pedido").
 * - Recebe requisições externas (usuário/interface).
 * - Encapsula e coordena chamadas para o domínio (Pedido, ItemPedido, etc.).
 * - Reduz o acoplamento entre a interface e as classes de negócios.
 *
 * Assim, a classe PedidoController evita que o main ou a interface manipulem diretamente o objeto Pedido.
 */
public class PedidoController {
    private final Pedido pedido;

    public PedidoController() {
        pedido = new Pedido();
    }

    public void adicionarItemAoPedido(ItemCardapio item, int quantidade) {
        pedido.adicionarItem(item, quantidade);
    }

    public void finalizarPedido() {
        pedido.exibirResumo();
    }
}
