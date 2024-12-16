package com.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Pedido{
    private static final Logger logger = Logger.getLogger(Pedido.class.getName());
    private List<Produto> produtos;
    private String cliente;

    public Pedido(String cliente){
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        logger.info("Pedido criado para o cliente: " + cliente);
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        logger.info("Produto adicionado ao pedido: " + produto.getNome() + " (Preço: " + produto.getPreco() + ")");
    }

    public float calcularTotal() {
        float total = 0.0f; 

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        if (total > 100) {
            total *= 0.9f;
            logger.info("Desconto de 10% aplicado.");
        }
        logger.info("Total: " + total);
        return total;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public String getCliente(){
        return this.cliente;
    }

}