package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileServe extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("application/jar");
        response.addHeader("Content-Disposition", "attachment; filename=\"i18n-ko.jar\"");

        ServletContext ctx = getServletContext();
        InputStream is = ctx.getResourceAsStream("/tomcat-i18n-ko.jar");

        int read = 0;
        byte[] buffer = new byte[4096];

        OutputStream os = response.getOutputStream();
        while ((read = is.read(buffer)) != -1) {
            os.write(buffer, 0, read);
        }
        os.flush();
        os.close();
    }
}
