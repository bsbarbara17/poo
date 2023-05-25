package com.edu.br;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
   
    @FXML TextField textMarca;
    @FXML TextField textAno;
    @FXML TextField textPreco;
    @FXML TextArea lista;


    List<Carro> carros = new ArrayList<>();

    public void cadastrar() {
        var carro = new Carro(
            textMarca.getText(),
            Integer.valueOf(textAno.getText()), 
            new BigDecimal(textPreco.getText())
        );
        carros.add(carro);
        mostrarCarros();
    }

    private void mostrarCarros() {
        carros.forEach(c -> lista.appendText(c.toString() + "\n"));
    }

    public void ordenarPorAno() {
        carros.sort((c1, c2) -> 
            Integer.compare(c1.getAno(), c2.getAno())
        );
        mostrarCarros();
    }

    public void ordenarPorMarca() {
        carros.sort((c1, c2) -> 
            Integer.compare(c1.getAno(), c2.getAno())
        );
        mostrarCarros();
    }

    public void ordenarPorPreco() {
        carros.sort((c1, c2) -> 
            Integer.compare(c1.getAno(), c2.getAno())
        );
        mostrarCarros();
    }
}