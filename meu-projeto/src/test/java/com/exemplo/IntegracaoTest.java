package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegracaoTest{

    @Test
    public void testePedido(){
        Catalogo catalogo = new Catalogo();

        Produto produto1 = new Produto(5, "Fone de Ouvido", 50.9f);
        Produto produto2 = new Produto(2, "Bolo de Pote", 7.9f);
        Produto produto3 = new Produto(4, "Kindle", 300.7f);

        catalogo.adicionarProduto(produto1);
        catalogo.adicionarProduto(produto2);
        catalogo.adicionarProduto(produto3);

        assertEquals(3, catalogo.quantidadeProdutos());

        Pedido pedido1 = new Pedido("Camila");
        Pedido pedido2 = new Pedido("Arthur");

        pedido1.adicionarProduto(catalogo.buscarProdutoPorId(5));
        pedido1.adicionarProduto(catalogo.buscarProdutoPorId(2));
        pedido2.adicionarProduto(catalogo.buscarProdutoPorId(4));

        assertEquals(2, pedido1.getProdutos().size());
        assertEquals(1, pedido2.getProdutos().size());

        //50.9 + 7.9 = 58.8
        assertEquals(58.8f, pedido1.calcularTotal(), 0.001f);
        //300.7 * 0.9 = 270.63
        assertEquals(270.63f, pedido2.calcularTotal(), 0.001f);


    }
}