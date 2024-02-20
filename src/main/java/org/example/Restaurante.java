package org.example;

import java.util.ArrayList;

public class Restaurante {
    String nome;
    Float avaliacao;
    ArrayList<Item> cardapio = new ArrayList<>();

    void getNome () {
        System.out.println("Nome: " + nome);
    }

    void adicionarItem (Item item) {
        cardapio.add(item);
    }

    void imprimirMenu () {
        for (Item i: cardapio) {
            System.out.println(i.nome + ": " + i.preco);
        }
    }
}
