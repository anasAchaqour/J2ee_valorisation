/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/valorisation"})
public class valorisation extends HttpServlet {

    public static float val1;
    public static float val2;
    public static float val3;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet valorisation</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");

            out.println("<form action='calval' method='post'>");
            out.println("Produit");
            out.println("<input type='text' name ='cd'><br><br>");
            out.println("Type");
            out.println("<input type='text' name ='tp'><br><br>");
            out.println("Quantite");
            out.println("<input type='text' name ='qt'><br><br>");
            out.println("Prix");
            out.println("<input type='text' name ='pr'><br><br><br><br>");
            out.println("Valorisation de type 1 :" + val1);
            out.println("<br>");
            out.println("Valorisation de type 2 :" + val2);
            out.println("<br>");
            out.println("Valorisation de type 3 :" + val3);
            out.println("<br><br><br><br><br>");

            out.println("<input type='submit' value='Next' name ='choix'>");
            out.println("<input type='submit' value='Global' name ='choix'>");

            out.println("</form>");

            out.println("</center>");

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
