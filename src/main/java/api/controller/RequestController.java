package api.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import api.contract.InterfaceService;
import api.service.RequestService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/api/request")
public class RequestController extends HttpServlet{
    private InterfaceService  interfaceService;
    public RequestController(){
        interfaceService = new RequestService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            List<Object> requests=interfaceService;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    }


