/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DadosMocados;
import model.Musica;

/**
 *
 * @author Alexsandro
 */
@WebServlet(name = "catalogoController", urlPatterns = {"/cadastro", "/editar", "/lista"})
public class CatalogoController extends HttpServlet {
    private Musica musica;
    private DadosMocados dadosMocados;
    private ArrayList<Musica> listaMusicas;

    public CatalogoController(){
        super();
        this.dadosMocados = new DadosMocados();
        this.listaMusicas = dadosMocados.listaMusicas();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        String action = request.getServletPath();

        if (action.equalsIgnoreCase("/cadastro")){
            RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro.jsp");
            dispatcher.forward(request, response);
        }
        else if (action.equalsIgnoreCase("/lista")){

            request.setAttribute("lista", listaMusicas);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("lista.jsp");
            dispatcher.forward(request, response);
        }
        else 
            response.sendRedirect("index.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        
        String titulo = request.getParameter("titulo");
        float valor =  Float.parseFloat(request.getParameter("valor"));
        Integer vendas =  Integer.parseInt(request.getParameter("vendas"));
                
        
        musica = new Musica(titulo,vendas,valor);
        
        listaMusicas.add(musica);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
