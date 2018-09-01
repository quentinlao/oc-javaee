package com.calculator.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int first = 0;
		int second = 0;
		if(request.getParameter("first").length() > 0) {
			first = Integer.parseInt(request.getParameter("first"));
		}
		if(request.getParameter("second").length() > 0) {
			second = Integer.parseInt(request.getParameter("second"));
		}
		String action = request.getParameter("action");
		int result = 0;
		switch(action) {
			case "+":
				result = first + second;
				break;
			case "-":
				result = first - second;
				break;
			case "/":
				result = first / second;
				break;
			case "*":
				result = first * second;
				break;
			default:
				break;
		}
		request.setAttribute("first", first);
		request.setAttribute("second", second);
		request.setAttribute("result", result);		
		request.setAttribute("action", action);
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);

	}

}
