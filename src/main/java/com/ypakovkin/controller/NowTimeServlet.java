package com.ypakovkin.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@WebServlet(name = "NowTimeServlet", urlPatterns = {"/nowtime"})
public class NowTimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        LocalDateTime localDateTime = LocalDateTime.now();
        String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy.HH:mm:ss"));
        response.setContentType("text/html;charset=utf-8");
        Cookie cookie = new Cookie("lastTimeVisit", localDateTime.toString());
        response.addCookie(cookie);

        LocalDateTime lastTimeVisit = null;
        for(Cookie cookie1 : request.getCookies()){
            if(cookie1.getName().equals("lastTimeVisit")){
                lastTimeVisit = LocalDateTime.parse(cookie1.getValue());
            }
        }

        try(PrintWriter writer = response.getWriter();){
            writer.println("<html><head><meta charset=\"UTF-8\" /></head>");
            writer.println("<body>");
            writer.println("<h1> Зараз: " + nowTime +" </h1>");
            if(lastTimeVisit != null) {
                writer.println("<h1> Були у нас: " + lastTimeVisit.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + " </h1>");
            }
            writer.println("</body>");
            writer.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
