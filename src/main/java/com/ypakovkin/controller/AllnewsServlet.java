package com.ypakovkin.controller;

import com.ypakovkin.dao.MenuDao;
import com.ypakovkin.model.MenuItem;
import com.ypakovkin.service.SelectedMenuItem;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AllnewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MenuItem> menuItemList = new MenuDao().getAll(0, SelectedMenuItem.menuItem(request.getRequestURI()));
        request.setAttribute("menuItemList", menuItemList);

        request.getRequestDispatcher("allnews.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
