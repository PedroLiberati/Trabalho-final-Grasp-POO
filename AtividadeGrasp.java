package com.mycompany.atividadegrasp;

/**
 * classe principal do sistema
 * ele mostra o uso dos padrões grasp: Creator e Controller.
 */
public class AtividadeGrasp {
    public static void main(String[] args) {
        // Criando alguns itens do cardápio
        ItemCardapio pizza = new ItemCardapio("Pizza", 45.0);
        ItemCardapio refrigerante = new ItemCardapio("Refrigerante", 8.0);

        // Criando o controlador (Controller)
        PedidoController controller = new PedidoController();

        // Adicionando itens ao pedido via controlador
        controller.adicionarItemAoPedido(pizza, 2);
        controller.adicionarItemAoPedido(refrigerante, 3);

        // Finalizando o pedido
        controller.finalizarPedido();
    }
}
