/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import carrinho.*;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    public static void main(String[] args) {
        // criar produtos
        Produto produto1 = new Produto("Camiseta", 29.90);
        Produto produto2 = new Produto("Calça", 129.90);
        Produto produto3 = new Promocao("Tenis", 590.90, 0.5);
        Produto produto4 = new Promocao("Calça Cargo", 159.90, 0.1);
        Produto produto5 = new Produto("Boné", 90.00);
        
        
        // criar um pedido
        Pedido pedido1 = new Pedido("Cliente1", 1);
        pedido1.adicionarItem(produto1);
        pedido1.adicionarItem(produto2);
        pedido1.adicionarItem(produto3);
        
        Pedido pedido2 = new Pedido("Cliente2", 2);
        pedido2.adicionarItem(produto3);
        pedido2.adicionarItem(produto4);
        pedido2.adicionarItem(produto5);
        
        
        pedido1.imprimirPedido();
        
        pedido2.imprimirPedido();
        
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        
        for (Pedido pedido : pedidos) {
         double precoTotalPedido = pedido.calcularPrecoTotal();
         System.out.println("Pedido de " + pedido.getNomeCliente() + " - Numero: " + pedido.getNumeroPedido() + "= Total: R$" + precoTotalPedido);
        }
    }
}
