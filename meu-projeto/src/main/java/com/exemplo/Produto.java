package com.exemplo;

public class Produto{
    private int id;
    private String nome;
    private float preco;

    public Produto(int id, String nome, float preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public float getPreco(){
        return this.preco;
    }
}