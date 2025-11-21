package org.joseAntonio.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.joseAntonio.dao.UsuariosDAO;
import org.joseAntonio.dao.UsuariosDAOImpl;
import org.joseAntonio.model.Usuario;

import java.io.IOException;
import java.io.Serializable;

@WebServlet(name = "usuariosServlet", value = "/tienda/usuarios/*")
public class UsuariosServlet implements Serializable {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String rol =  request.getParameter("rol");
        String password =  request.getParameter("password");
        Usuario usuario = new Usuario();
        try {

        }


    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;
        UsuariosDAO usuarioDAO = new UsuariosDAOImpl();
        String id = request.getParameter("id");

        try {
            int codgio = Integer.parseInt(id);
            usuarioDAO.delete(codgio);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }
}
