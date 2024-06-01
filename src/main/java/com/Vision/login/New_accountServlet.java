package com.Vision.login;

import java.io.IOException;
import database_service.Db_services;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@WebServlet(urlPatterns = "/sign_up.do")
public class New_accountServlet extends HttpServlet {
	
	private LoginService userService = new LoginService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/sign_up.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String gender = request.getParameter("gender");

		String saltvalue = New_accountService.getSaltvalue(30);   
	        String encryptedpassword = New_accountService.generateSecurePassword(password, saltvalue);
		
		User user = new User(first_name,last_name,encryptedpassword,email,saltvalue,gender);
		  
		boolean status = Db_services.insert_User(user);
		  
		  if (status) { 
			  User new_user = userService.getUser(email, encryptedpassword);
			  request.getSession().setAttribute("first_name",new_user.getFirst_name());
			  request.getSession().setAttribute("last_name",new_user.getLast_name());
			  request.getSession().setAttribute("email",email);
			  request.getSession().setAttribute("ID",new_user.getID());
			  request.getSession().setAttribute("gender",gender);
			  response.sendRedirect("/home.do"); 
			  }else{
				  request.setAttribute("errorMessage", "Coudld not add you to the plateform");
				  request.getRequestDispatcher("/WEB-INF/views/sign_up.jsp").forward(request, response);
			  } 
		}
}

