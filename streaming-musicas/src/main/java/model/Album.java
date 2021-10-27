/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Alexsandro
 */
public class Album {
    private String titulo;
    private ArrayList<Musica> musicas;
    private Integer ano;
    
    public Album(){
    }

    public Album(String titulo, ArrayList<Musica> musicas, Integer ano) {
        this.titulo = titulo;
        this.musicas = musicas;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    public void gerarAlbuns(){
        ArrayList<Musica> musicas = new ArrayList();
            
        Musica m1 = new Musica("Jorge da Capadócia");
        musicas.add(m1);
        Musica m2 = new Musica ("Gênesis");
        musicas.add(m2);
        Musica m3 = new Musica ("Capítulo 4 Versículo 3");
        musicas.add(m3);
        Musica m4 = new Musica ("Tô Ouvindo Alguém me Chamar");
        musicas.add(m4);
        Musica m5 = new Musica ("Rapaz Comum");
        musicas.add(m5);
        Musica m6 = new Musica ("(instrumental)");
        musicas.add(m6);
        Musica m7 = new Musica ("Diário de um Detento");
        musicas.add(m7);
        Musica m8 = new Musica ("Periferia é Periferia em Qualquer Lugar");
        musicas.add(m8);
        Musica m9 = new Musica ("Qual Mentira Vou Acreditar?");
        musicas.add(m9);
        Musica m10 = new Musica ("Mágico de Oz");
        musicas.add(m10);
        Musica m11 = new Musica ("Fórmula Mágica da Paz");
        musicas.add(m11);
        Musica m12 = new Musica ("Salve");
        musicas.add(m12);
        
        Album album = new Album("Sobrevivendo no inferno", musicas, 1997);
    }
}

