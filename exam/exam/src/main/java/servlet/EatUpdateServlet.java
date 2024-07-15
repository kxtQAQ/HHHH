package servlet;

import service.EatServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class EatUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理乱码
        req.setCharacterEncoding("utf-8");
        //接受请求
        String id = req.getParameter("id");
        String price = req.getParameter("price");
        String sort = req.getParameter("sort");
        EatServiceImpl eatService = new EatServiceImpl();
        int i = eatService.update(id, Integer.parseInt(price),sort);

        //页面导航
        resp.sendRedirect("/dishes");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}