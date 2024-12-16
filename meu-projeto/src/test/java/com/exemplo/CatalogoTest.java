package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatalogoTest{
    
    @Test
    public void testAdicionarnoCatalogo(){
        Catalogo catalogo = new Catalogo();
        Produto produto1 = new Produto(5, "Fone de Ouvido", 50.9f);
        Produto produto2 = new Produto(2, "Bolo de Pote", 7.9f);
        Produto produto3 = new Produto(4, "Kindle", 300.7f);

        catalogo.adicionarProduto(produto1);
        catalogo.adicionarProduto(produto2);
        catalogo.adicionarProduto(produto3);

        assertEquals(3, catalogo.quantidadeProdutos());
        assertEquals("Kindle", catalogo.buscarProdutoPorId(4).getNome());

    }

    @Test
    public void testBuscaProdutosInexistente(){
        Catalogo catalogo = new Catalogo();

        assertNull(catalogo.buscarProdutoPorId(1));
    }
}