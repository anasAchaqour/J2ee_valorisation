
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
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet calval</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>");
                out.println("la valorisation Globale est :" + cal);
                out.println("</h1>");
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
