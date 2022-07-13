package kz.bitlab.servlets;
import kz.bitlab.db.DBManager;
import kz.bitlab.db.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"" +
                " integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class= 'container'>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class= 'col-6 mx-auto'>");
        out.print("<form action = '/apply' method='post'>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<label>NAME : </label>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-2'>");
        out.print("<div class = 'col-12'>");
        out.print("<input type = 'text' class = 'form-control' name='user_name'>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<label>SURNAME : </label>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-2'>");
        out.print("<div class = 'col-12'>");
        out.print("<input type = 'text' class = 'form-control' name='user_surname'>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<button class='btn btn-success'>ADD WORKER</button>");
        out.print("</div>");
        out.print("</div>");
        out.print("</form>");
        ArrayList<User> users = DBManager.getAllUsers();
        for (User usr : users){
            out.println("<p>"+usr.getName()+" " +usr.getSurname()+"<p>");
        }
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }
}