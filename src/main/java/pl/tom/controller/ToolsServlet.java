package pl.tom.controller;
import pl.tom.service.ToolService;
import pl.tom.service.ToolServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class ToolsServlet extends HttpServlet {

    private final ToolService toolService = new ToolServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("tools", toolService.getAllTools());

        getServletContext().getRequestDispatcher("/tools.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        long id = Long.parseLong(request.getParameter("id"));

        switch (action){
            case "take":
                toolService.setAvailability(false, id);
                break;
            case "return":
                toolService.setAvailability(true, id );
                break;
        }

        response.sendRedirect(getServletContext().getContextPath() + "/");


    }
}
