package servlet;

import com.github.pagehelper.PageInfo;
import service.EatServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/dishes")
public class EatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageNum = req.getParameter("pageNum");
        //
        int i = 1;
        if (pageNum != null && !pageNum.equals("")) {
            i = Integer.parseInt(pageNum);

        }

        EatServiceImpl eatService = new EatServiceImpl();
        PageInfo pageInfo = eatService.queryAll(i, 5);

        req.setAttribute("pageInfo", pageInfo);

        try {
            req.getRequestDispatcher("dish.jsp").forward(req, resp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
