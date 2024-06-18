package com.Vision.restaurants_details_servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database_service.CommentTable;
import database_service.Db_services;
import database_service.RateTable;
import model.Comment;
import model.Product;
import model.Rate;



@WebServlet("/restaurants_details.do")
public class restaurants_details_servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		List<Product> foods = Db_services.get_all_foods_for_restaurant(id);
		request.setAttribute("list_foods", foods);

		request.getRequestDispatcher("/WEB-INF/views/restaurants_details.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//need to add a check for the values of rate and comment coming from the front not to be null 
		Comment comment = new Comment();
		Rate rating =  new Rate();
		String commentaire = request.getParameter("commentaire");
		String rate = request.getParameter("note");
		rating.setRating(rate); 
		comment.setComment(commentaire);
		
		RateTable nTable = new RateTable();
		nTable.ajouterNote(rating);
		CommentTable commentTable = new CommentTable();
		commentTable.ajouterComment(comment);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/restaurants_details.jsp").forward(request, response);
	}

}
