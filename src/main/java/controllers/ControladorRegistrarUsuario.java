/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import backend.database.CreadorUsuarios;
import backend.usuarios.Usuario;
import exceptions.ExceptionRevistasWeb;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author brandon
 */
@WebServlet(name = "ControladorRegistrarUsuario", urlPatterns = {"/ControladorRegistrarUsuario"})
public class ControladorRegistrarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorRegistrarUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorRegistrarUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String usuario = request.getParameter("usuario");
//        String contraseña = request.getParameter("contraseña");
//        String hobbies = request.getParameter("hobbies");
//        String temasInteres = request.getParameter("temasInteres");
//        String gustos = request.getParameter("gustos");
//        String descripcion = request.getParameter("descripcion");
//        String tipoUsuario = request.getParameter("tipoUsuario");
//        System.out.println("Usuario: " + usuario);
//        System.out.println("Contraseña: " + contraseña);
//        System.out.println("Hobbies: " + hobbies);
//        System.out.println("Temas de Interes: " + temasInteres);
//        System.out.println("Gustos: " + gustos);
//        System.out.println("Descripcion: " + descripcion);
//        System.out.println("Tipo de Usuario: " + tipoUsuario);
        CreadorUsuarios creadorUsuarios = new CreadorUsuarios();
        try {
            Usuario usuarioCreado = creadorUsuarios.crearUsuario(request);
//            request.setAttribute("Usuario creado", usuarioCreado);
//            request.getRequestDispatcher("/crear-usuario.jsp");
        } catch (ExceptionRevistasWeb e) {
            e.getStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
