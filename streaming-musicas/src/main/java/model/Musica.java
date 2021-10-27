/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alexsandro
 */
public class Musica {
    private String titulo;
    private Integer vendas;
    private float valor;
    
    public Musica(){
        
    }

    public Musica(String titulo, Integer vendas, float valor) {
        this.titulo = titulo;
        this.vendas = vendas;
        this.valor = valor;
    }
    
    public Musica(String titulo) {
        this.titulo = titulo;
        this.vendas = num();
        this.valor = valor();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getVendas() {
        return vendas;
    }

    public void setVendas(Integer vendas) {
        this.vendas = vendas;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    static int num(){
        int  num = ((int) (Math.random()*200));
        return num;
    }
    
    static float valor(){
        float valor = (float) (Math.random()*2)+1;
        return valor;
    }
}
