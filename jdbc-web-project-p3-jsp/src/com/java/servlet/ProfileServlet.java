package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.User;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet of ProfileServlet .... ");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost of ProfileServlet .... ");
		
		String email = request.getParameter("email");
		User user = new User();
		user.setEmail(email);
		
		request.setAttribute("user",user);
		
		/*request.getRequestDispatcher("profile.jsp").forward(request, response);*/
		
		RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		rd.forward(request, response);
		
/*		String name =  request.getParameter("email");
		PrintWriter out = response.getWriter();
		response.setContentType("text/HTML");
		
		String message = (String)request.getAttribute("msg");
		out.print("Hello -"+name+"---"+message);*/
		
		
	}

}
