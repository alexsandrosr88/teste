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
public class LivroModel { 
    private ArrayList<Livro> livros;
    
    public LivroModel(){
        livros = new ArrayList<Livro>();
        this.gerarLista();
    }
    
    private void gerarLista(){
        Livro livro = new Livro("Admiravel Novo Mundo","Aldous Huxley","Biblioteca Azul", 1932);
        this.livros.add(livro);       
        
        livro = new Livro("1984","George orwell","Companhia das letras", 1949);
        this.livros.add(livro);       
        
        livro = new Livro("O processo","Franz Kafka","Via Leitura", 1932);
        this.livros.add(livro);       
        
        livro = new Livro("O lobo da Estepe","Hermann Hesse","Record", 1927);
        this.livros.add(livro);        
        
        livro = new Livro("Raizes do Brasil","Sergio Buarque","Jose Olympio", 1936);
        this.livros.add(livro);            
    }
    
    public ArrayList<Livro> listarLivros(){
        return this.livros;
    }      
}
