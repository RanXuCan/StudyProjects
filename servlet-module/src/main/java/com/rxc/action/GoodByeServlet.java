package com.rxc.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/27 22:32
 */
@WebServlet(name = "goodByeServlet", urlPatterns = "/goodBy")
public class GoodByeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utr-8");
        PrintWriter writer = resp.getWriter();
        String username = req.getParameter("username");
        writer.println("goodBy" + username);
        writer.println("this servlet is finished by annotation instead of configuration in web.xml");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
