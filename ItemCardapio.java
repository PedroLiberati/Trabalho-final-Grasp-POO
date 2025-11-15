package com.mycompany.atividadegrasp;

/**
 * Classe que representa um item do cardápio do restaurante.
 *
 * Esta classe faz parte da entidade de domínio, mas aqui não se aplica
 * diretamente nenhum padrão GRASP. Ela serve como estrutura de dados simples.
 */
public class ItemCardapio {
    private final String nome;
    private final double preco;

    public ItemCardapio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
