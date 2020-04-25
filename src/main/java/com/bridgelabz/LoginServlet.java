package com.bridgelabz;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description = "Login servlet testing",
        urlPatterns = {"/LoginServlet"},
        initParams = {
                @WebInitParam(name = "user", value = "Jitesh"),
                @WebInitParam(name = "password", value = "1234")
        }
)

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        String userId = getServletConfig().getInitParameter("user");
        String passwordValue = getServletConfig().getInitParameter("password");

        if (userId.equals(user) && passwordValue.equals(password)) {
            request.setAttribute("user", user);
            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, responce);
        } else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/Login.html");
            PrintWriter out = responce.getWriter();
            out.println("<font color=red> Either username and password is wrong </font>");
            requestDispatcher.include(request, responce);
        }

    }
}
