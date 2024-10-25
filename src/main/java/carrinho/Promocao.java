/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrinho;

public class Promocao extends Produto {
    private double desconto;

    // Construtor da classe Promocao
    public Promocao(String nome, double preco, double desconto) {
        super(nome, preco); // Chama o construtor da classe Produto
        this.desconto = desconto;
    }

    // Implementação do método da interface ComponentePedido
    @Override
    public double calcularPrecoTotal() {
        return super.calcularPrecoTotal() * (1 - desconto); // Aplica o desconto ao preço do produto
    }

    // Representação em formato de string para exibição
    @Override
    public String toString() {
        return "Produto em Promoção: " + super.toString() + ", Desconto: " + (desconto * 100) + "%";
    }
}
