package com.gmail.dimabah.javapro.homeworks.first;

import java.io.*;

import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String template = "<html><head><title>JavaProHomeworks</title>" +
                "<link rel=\"stylesheet\" href=\"style.css\"></head>" +
                "<body><h1>Hello, %s</h1></body></html>";
        String name = req.getParameter("name");
        resp.setContentType("text/html");
        try (PrintWriter pw = resp.getWriter()) {
            pw.println(String.format(template, name));
        }
    }
}