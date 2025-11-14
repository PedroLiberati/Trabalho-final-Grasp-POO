package com.mycompany.atividadegrasp;

/*
 * Classe principal do sistema.
 *
 * Aqui temos o uso de dois padrões GRASP:
 *
 * - Controller: a classe PedidoController é usada como ponto central de
 *   coordenação das operações do sistema, recebendo solicitações do main.
 *
 * - Creator: o próprio Pedido será responsável por criar os objetos ItemPedido,
 *   pois é ele quem possui as informações necessárias para essa criação. 
 */
public class AtividadeGrasp {
    public static void main(String[] args) {

        ItemCardapio pizza = new ItemCardapio("Pizza", 45.0);
        ItemCardapio refrigerante = new ItemCardapio("Refrigerante", 8.0);

        PedidoController controller = new PedidoController();

        controller.adicionarItemAoPedido(pizza, 2);
        controller.adicionarItemAoPedido(refrigerante, 3);

        controller.finalizarPedido();
    }
}
