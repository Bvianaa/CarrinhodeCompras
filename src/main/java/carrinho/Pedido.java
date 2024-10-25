/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrinho;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private List<ComponentePedido> lista; // Lista de componentes do pedido
    private int numeroPedido;
    
     public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    // Construtor da classe Pedido
    public Pedido(String nomeCliente, int numeroPedido) {
        this.nomeCliente = nomeCliente;
        this.numeroPedido = numeroPedido;
        this.lista = new ArrayList<>(); // Inicializa a lista de componentes
    }

    // Método para adicionar um componente ao pedido
    public void adicionarItem(ComponentePedido item) {
        lista.add(item);
    }

    // Método para calcular o preço total do pedido
    public double calcularPrecoTotal() {
        double total = 0;
        for (ComponentePedido item : lista) {
            total += item.calcularPrecoTotal(); // Calcula o preço total somando os preços dos componentes
        }
        return total;
    }

    // Método para imprimir os detalhes do pedido
    public void imprimirPedido() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Itens do Pedido:");
        for (ComponentePedido item : lista) {
            System.out.println(item); // Exibe os detalhes de cada componente do pedido
        }
        System.out.println("Total da Compra: R$" + calcularPrecoTotal()); // Exibe o preço total do pedido
    }
}