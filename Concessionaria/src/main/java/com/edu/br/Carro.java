package com.edu.br;

import java.math.BigDecimal;

public class Carro {

    private String marca;
    private int ano;
    private BigDecimal preco;

    public Carro(String marca, int ano, BigDecimal preco) {
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }
    
    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public BigDecimal getPreco() {
        return preco;
    }


    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }


   
    
}
