package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.User;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet of LoginServlet .... ");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost of LoginServlet .... ");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (email.equalsIgnoreCase(password)) {
			request.setAttribute("msg", "Login success !!!");
			RequestDispatcher rd = request.getRequestDispatcher("profile");
			rd.forward(request, response);
		} else {
			request.setAttribute("msg", "Login Failed !!!");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
		
		

	}

}
