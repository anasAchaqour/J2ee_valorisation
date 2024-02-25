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
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("  <title>Servlet valorisation</title>");
            out.println("  <!-- Add Bootstrap CSS CDN link -->");
            out.println("  <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>");
            out.println("</head>");
            out.println("<body>");

            out.println("<div class='container mt-5'>");
            out.println("  <form action='calval' method='post'>");
            out.println("    <div class='form-group'>");
            out.println("      <label for='cd'>Produit</label>");
            out.println("      <input type='text' class='form-control' name='cd'>");
            out.println("    </div>");
            out.println("    <div class='form-group'>");
            out.println("      <label for='tp'>Type</label>");
            out.println("      <input type='text' class='form-control' name='tp'>");
            out.println("    </div>");
            out.println("    <div class='form-group'>");
            out.println("      <label for='qt'>Quantite</label>");
            out.println("      <input type='text' class='form-control' name='qt'>");
            out.println("    </div>");
            out.println("    <div class='form-group'>");
            out.println("      <label for='pr'>Prix</label>");
            out.println("      <input type='text' class='form-control' name='pr'>");
            out.println("    </div>");
            out.println("    <div class='form-group'>");
            out.println("      <p>Valorisation de type 1: " + val1 + "</p>");
            out.println("      <p>Valorisation de type 2: " + val2 + "</p>");
            out.println("      <p>Valorisation de type 3: " + val3 + "</p>");
            out.println("    </div>");
            out.println("    <button type='submit' class='btn btn-primary' name='choix' value='Next'>Next</button>");
            out.println("    <button type='submit' class='btn btn-primary' name='choix' value='Global'>Global</button>");
            out.println("  </form>");
            out.println("</div>");

            out.println("  <!-- Add Bootstrap JS and Popper.js CDN scripts -->");
            out.println("  <script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
            out.println("  <script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js'></script>");
            out.println("  <script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");
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
