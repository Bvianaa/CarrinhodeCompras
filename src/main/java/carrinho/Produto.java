/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrinho;

public class Produto implements ComponentePedido {
    private String nome;
    private double preco;

    // Construtor da classe Produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Implementação do método da interface ComponentePedido
    @Override
    public double calcularPrecoTotal() {
        return preco; // Retorna o preço do produto
    }

    // Representação em formato de string para exibição
    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco;
    }
}
