package com.exemplo;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Catalogo{
    private static final Logger logger = Logger.getLogger(Catalogo.class.getName());
    ArrayList<Produto> catalogo;

    public Catalogo(){
        this.catalogo = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        if(buscarProdutoPorId(produto.getId()) == null){
            catalogo.add(produto);
            logger.info("Produto adicionado ao catálogo: " + produto.getNome() + " (ID: " + produto.getId() + ")");
        }else{
            logger.info("O produto já foi cadastrado no catálogo");
        }
        
    }

    public void listarProdutos(){
        for(Produto produto : catalogo){
            System.out.println("--------------------");
            System.out.println("Id: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
        }
    }

    public Produto buscarProdutoPorId(int id){
        for(Produto produto : catalogo){
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }

    public int quantidadeProdutos(){
        int total = 0;
        for(Produto produto : catalogo){
            total++;
        }

        return total;
    }
}