package com.example.extendeddemo.controller;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = LogManager.getLogger(FrontControllerServlet.class.getName());
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//requestType should equal the value of type in each form
		String requestType = request.getParameter("type"); //categories
		
		//creates and empty RequestDispatcher for future forwarding
		RequestDispatcher dispatcher = null;
		
		if ("createCategory".equals(requestType) || "updateCategory".equals(requestType)) {
			dispatcher = request.getRequestDispatcher("categories");
		}else if ("login".equals(requestType)) {
			dispatcher = request.getRequestDispatcher("login");
		} else if ("home".equals(requestType)) {
			dispatcher = request.getRequestDispatcher("home");
		} else if ("categories".equals(requestType)) {
			dispatcher = request.getRequestDispatcher("categories");
		} else {
			dispatcher = request.getRequestDispatcher("error");
		}
		dispatcher.forward(request, response);
	}








}
