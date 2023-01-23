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
    private InterfaceService service;

    public RequestController() {
        this.service = new RequestService();

    }
        
    

    }


