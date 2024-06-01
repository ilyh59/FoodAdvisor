package database_service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Comment;

public class CommentTable {
	private Connection connexion;

	private void loadDatabase() {
		// Chargement du driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		}

		try {
			connexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "ismTHEyh123*");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void ajouterComment(Comment comment) {
		loadDatabase();

		try {
			PreparedStatement preparedStatement = (PreparedStatement) connexion.prepareStatement("INSERT INTO comment(comment) VALUES(?);");
			preparedStatement.setString(1, comment.getComment());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
