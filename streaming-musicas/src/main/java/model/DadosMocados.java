/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexsandro
 */
public class DadosMocados {

    private ArrayList<Musica> musica;

    public DadosMocados() {
        musica = new ArrayList<Musica>();
        this.geraLista();
    }

    public void geraLista() {

        Musica musica = new Musica();

        ArrayList<Musica> musicas = new ArrayList();

        musica = new Musica("Jorge da Capadócia");
        this.musica.add(musica);
        musica = new Musica("Gênesis");
        this.musica.add(musica);
        musica = new Musica("Capítulo 4 Versículo 3");
        this.musica.add(musica);
        musica = new Musica("Tô Ouvindo Alguém me Chamar");
        this.musica.add(musica);
        musica = new Musica("Rapaz Comum");
        this.musica.add(musica);
        musica = new Musica("(instrumental)");
        this.musica.add(musica);
        musica = new Musica("Diário de um Detento");
        this.musica.add(musica);
        musica = new Musica("Periferia é Periferia em Qualquer Lugar");
        this.musica.add(musica);
        musica = new Musica("Qual Mentira Vou Acreditar?");
        this.musica.add(musica);
        musica = new Musica("Mágico de Oz");
        this.musica.add(musica);
        musica = new Musica("Fórmula Mágica da Paz");
        this.musica.add(musica);
        musica = new Musica("Salve");
        this.musica.add(musica);

        musica = new Musica("Sou + Você");
        this.musica.add(musica);
        musica = new Musica("Vivão e Vivendo");
        this.musica.add(musica);
        musica = new Musica("Negro Drama");
        this.musica.add(musica);
        musica = new Musica("A Vítima");
        this.musica.add(musica);
        musica = new Musica("Na Fé Firmão");
        this.musica.add(musica);
        musica = new Musica("12 de Outubro");
        this.musica.add(musica);
        musica = new Musica("Eu Sou 157");
        this.musica.add(musica);
        musica = new Musica("A Vida É Desafio");
        this.musica.add(musica);
        musica = new Musica("1 por Amor, 2 por Dinheiro");
        this.musica.add(musica);

        musica = new Musica("De Volta à Cena");
        this.musica.add(musica);
        musica = new Musica("Otus 500");
        this.musica.add(musica);
        musica = new Musica("Crime Vai e Vem");
        this.musica.add(musica);
        musica = new Musica("Jesus Chorou");
        this.musica.add(musica);
        musica = new Musica("Fone (Intro)");
        this.musica.add(musica);
        musica = new Musica("Vida Loka II");
        this.musica.add(musica);
        musica = new Musica("Expresso da Meia-Noite");
        this.musica.add(musica);
        musica = new Musica("A Vida É Desafio");
        this.musica.add(musica);
        musica = new Musica("Trutas e Quebradas");
        this.musica.add(musica);
        musica = new Musica("Da Ponte Pra Cá");
        this.musica.add(musica);
    }

    public ArrayList<Musica> listaMusicas() {
        sort(musica);
        return this.musica;
    }

    public void sort(List<Musica> musica) {
        int n = musica.size();
        for (int i = 0; i < n - 1; i++) { //(n-1) vezes
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (musica.get(j).getVendas()
                        > musica.get(min).getVendas()) {
                    min = j;
                }
            }
            if (min != i) {
                //Trocar os objetos das posições min e i
                Musica aux = musica.get(min);
                musica.set(min, musica.get(i));
                musica.set(i, aux);
            }
        }
    }
}
