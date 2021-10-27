/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexsandro
 */
public class NewClass {

    public static void main(String[] args) {
       
     DadosMocados d1 = new DadosMocados();
     Musica musica = new Musica();
     ArrayList<Musica> list = d1.listaMusicas();
        
        sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getVendas());
        }

    }
    
    static void sort(List<Musica> musica) {
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
