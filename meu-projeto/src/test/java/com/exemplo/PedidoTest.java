package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest{
    @Test
    public void testAdicionarPedido(){
        Pedido pedido = new Pedido("Camila");
        Produto produto1 = new Produto(5, "Fone de Ouvido", 50.9f);
        Produto produto2 = new Produto(2, "Bolo de Pote", 7.9f);
        Produto produto3 = new Produto(4, "Kindle", 300.7f);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        assertEquals(3, pedido.getProdutos().size());
        assertEquals("Camila", pedido.getCliente());
    }

    @Test
    public void testCalcularTotal(){
        Pedido pedido = new Pedido("Camila");
        Produto produto1 = new Produto(5, "Fone de Ouvido", 50.9f);
        Produto produto2 = new Produto(2, "Bolo de Pote", 7.9f);
        Produto produto3 = new Produto(4, "Kindle", 300.7f);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        assertEquals(323.55f, pedido.calcularTotal(), 0.001f);

    }
}