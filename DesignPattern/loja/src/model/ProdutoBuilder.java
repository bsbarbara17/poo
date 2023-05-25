package model;

public class ProdutoBuilder {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public ProdutoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }


    public ProdutoBuilder preco(Double preco) {
        this. preco =  preco;
        return this;
    }

    public ProdutoBuilder quantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Produto build() {
        return new Produto(id, nome, descricao, preco, quantidade);
    }
}

