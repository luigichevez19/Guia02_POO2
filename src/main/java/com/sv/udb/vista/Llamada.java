/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.recursos.Email;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luis
 */
@WebServlet(name = "Llamada", urlPatterns = {"/Llamada"})
public class Llamada extends HttpServlet {

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
        
         boolean esValido = request.getMethod().equals("POST");
       String mens="";
       
       if(!esValido)
       {
            response.sendRedirect(request.getContextPath()+"/index.jsp");
       }
       else
       {   
            String cc = "diegochevez15@gmail.com";// request.getParameter("cc");
            String cco = "diegochevez15@gmail.com";//request.getParameter("cco");
            String asunto ="Prueba"; //request.getParameter("asunto");
            String mensaje ="Hello, How are you?"; //request.getParameter("mensaje");
            String[] mailList = request.getParameterValues("usuarios");
            int i =1;
            for(String mail : mailList)
            {
                 Email enviar = new Email(mensaje, mail, asunto,cc,cco);
                 enviar.SendMail(i);
                 i++;
            }
            
            request.setAttribute("mensAlert", mens);
            request.getRequestDispatcher("/index.jsp").forward(request, response);  
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
