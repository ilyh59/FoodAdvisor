package com.Vision.home;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database_service.Db_services;
import model.Restaurant;

@WebServlet("/home.do")
public class home extends HttpServlet {
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Restaurant> restaurants = Db_services.selectAllRestaurants();

		request.setAttribute("listRestaurants", restaurants);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/home.jsp");
		dispatcher.forward(request, response);

	}
}
