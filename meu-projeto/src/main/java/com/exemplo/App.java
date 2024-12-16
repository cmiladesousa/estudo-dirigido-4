package com.exemplo;

public class App {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Produto produto1 = new Produto(5, "Fone de Ouvido", 50.9f);
        Produto produto2 = new Produto(2, "Bolo de Pote", 7.9f);

        catalogo.adicionarProduto(produto1);
        catalogo.adicionarProduto(produto2);

        Pedido pedido1 = new Pedido("Camila");
        pedido1.adicionarProduto(catalogo.buscarProdutoPorId(5));

        pedido1.calcularTotal();

    }
}

