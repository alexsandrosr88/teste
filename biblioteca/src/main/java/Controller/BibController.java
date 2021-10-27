package Controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Livro;
import model.LivroModel;

/**
 *
 * @author Alexsandro
 */
public class BibController extends HttpServlet {
    private Livro livro;
    private LivroModel modeloLivro;
    private ArrayList<Livro> listadeLivros;

    public BibController() {
        super();
        this.modeloLivro = new LivroModel();
        this.listadeLivros = modeloLivro.listarLivros();
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String titulo = request.getParameter("titulo");
        String autor =  request.getParameter("autor");
        String editora =  request.getParameter("editora");
        Integer ano =  Integer.parseInt(request.getParameter("ano"));
        
        livro = new Livro(titulo,autor,editora,ano);
        
        listadeLivros.add(livro);
        
        request.setAttribute("lista", listadeLivros);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("lista.jsp");
        dispatcher.forward(request, response);
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo(){
        return "Controladores da aplicação de biblioteca";
    }
}
