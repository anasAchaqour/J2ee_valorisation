
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calval"})
public class calval extends HttpServlet {

    float cal = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ch = request.getParameter("choix");
        if (ch.equals("Next")) {
            int t = Integer.parseInt(request.getParameter("tp"));
            float q = Float.parseFloat(request.getParameter("qt"));
            float p = Float.parseFloat(request.getParameter("pr"));
            cal = q * p;
            switch (t) {
                case 1:
                    valorisation.val1 = valorisation.val1 + cal;
                    break;
                case 2:
                    valorisation.val2 = valorisation.val2 + cal;
                    break;
                default:
                    valorisation.val3 = valorisation.val3 + cal;
                    break;
            }

//            ServletContext ct = request.getServletContext();
//            RequestDispatcher dis = ct.getRequestDispatcher("/valorisation");
//            dis.forward(request, response);
            response.sendRedirect(request.getContextPath() + "/valorisation");
        } else {
            cal = 0;
            cal = valorisation.val1 + (valorisation.val2 + valorisation.val3);

            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html lang='en'>");
                out.println("<head>");
                out.println("  <meta charset='UTF-8'>");
                out.println("  <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
                out.println("  <title>Servlet calval</title>");
                out.println("  <!-- Add Bootstrap CSS CDN link -->");
                out.println("  <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>");
                out.println("</head>");
                out.println("<body>");

                out.println("<div class='container mt-5'>");
                out.println("  <h1 class='display-4'>La Valorisation Globale est : " + cal + "</h1>");
                out.println("</div>");

                out.println("  <!-- Add Bootstrap JS and Popper.js CDN scripts -->");
                out.println("  <script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
                out.println("  <script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js'></script>");
                out.println("  <script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");
                out.println("</body>");
                out.println("</html>");

            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
