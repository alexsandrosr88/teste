package model;

import java.util.ArrayList;

/**
 *
 * @author Alexsandro
 */
public class Artista {

    private String titulo;
    private ArrayList<Album> albuns;
    private String gravadora;
    
    public Artista(){
        
    }

    public Artista(String titulo, ArrayList<Album> albuns, String gravadora) {
        this.titulo = titulo;
        this.albuns = albuns;
        this.gravadora = gravadora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(ArrayList<Album> albuns) {
        this.albuns = albuns;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
}
