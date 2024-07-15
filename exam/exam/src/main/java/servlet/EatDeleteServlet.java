package servlet;

import service.EatServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class EatDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //响应乱码
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");
        EatServiceImpl service = new EatServiceImpl();
        service.delete(id);
        resp.sendRedirect(req.getContextPath()+"/dishes");
    }

}
