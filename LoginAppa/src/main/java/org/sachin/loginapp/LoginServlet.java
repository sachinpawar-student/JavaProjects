package org.sachin.loginapp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.sachin.loginapp.dto.User;
import org.sachin.loginapp.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/LoginAppa")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId, password;

		userId = request.getParameter("userId");
		password = request.getParameter("password");

		LoginService service = new LoginService();
		Boolean result = service.authenticate(userId, password);
		
		if(result)
		{
			User user= service.getUsername(userId); 
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");  
			dispatcher.forward(request, response);
			return; 
		}
		
		else
		{

			response.sendRedirect("Login.jsp"); 
			
			return; 
			
		}

	}

}
