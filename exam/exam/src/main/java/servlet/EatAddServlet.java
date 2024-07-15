package servlet;

import entity.Eat;
import service.EatServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class EatAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //响应乱码
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        EatServiceImpl service = new EatServiceImpl();
        Eat eat = service.queryById(id);
        //转发重定向
        req.setAttribute("eat",eat);
        //页面导航
        try {
            req.getRequestDispatcher("add.jsp").forward(req, resp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
