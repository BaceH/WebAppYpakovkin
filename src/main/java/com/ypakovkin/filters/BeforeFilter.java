package com.ypakovkin.filters;

import com.ypakovkin.dao.MenuDao;
import com.ypakovkin.model.MenuItem;
import com.ypakovkin.service.SelectedMenuItem;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@WebFilter(filterName = "BeforeFilter")
public class BeforeFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
         chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
