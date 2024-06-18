package database_service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Product;
import model.Restaurant;
import model.User;

public class Db_services {
	
	public static Connection connect(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver O.K.");
			
			String url ="jdbc:mysql://localhost:3306/java";
			String user = "root";
			String passwd = "ismTHEyh123*";
		
			Connection con = DriverManager.getConnection(url,user,passwd);
			System.out.println("Connexion effective !");
			
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static boolean insert_User(User user) {
		Connection con = Db_services.connect();
	  try { 
		  String sqlInsert = "INSERT INTO user (first_name,last_name,email,password,saltvalue,gender) VALUES ('" + user.getFirst_name() + "','" + user.getLast_name() + "','" + user.getEmail() + "','" + user.getPassword() + "','" + user.getsaltvalue() + "' , '" + user.getGender() + "' )";
		  System.out.println(sqlInsert);
		  Statement smtinsert = con.createStatement();
		  smtinsert.executeUpdate(sqlInsert);
		  System.out.println("the insertion succeded"); 
		  return true;
	  }catch(Exception e) {
		  e.printStackTrace(); 
		  System.out.println("the insertion failed");
		  return false;
	  }
	}

	public static List<Restaurant> selectAllRestaurants() {
		List<Restaurant> restaurants = new ArrayList<>();
		Connection con = Db_services.connect();
		try {
			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement("Select * from Restaurants");
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("restaurant_id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String  phone_number = rs.getString("phone_number");
				String email = rs.getString("email");
				Long rating = rs.getLong("rating");
				String desctiption = rs.getString("description");
				String image_url = rs.getString("image_url");
				int owner_id = rs.getInt("owner_id");
				restaurants.add(new Restaurant(id, name, address, phone_number, email, desctiption, rating, owner_id, image_url));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurants;
	}

	public static List<Product> get_all_foods_for_restaurant(String restautant_id){
		List<Product> foods = new ArrayList<>();
		Connection con  = Db_services.connect();
		try {
			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement("Select * from FoodItems where restaurant_id = ?");
			preparedStatement.setInt(1, Integer.parseInt(restautant_id));
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("food_id");
				int restaurant_id = rs.getInt("restaurant_id");
				String name = rs.getString("name");
				String desctiption = rs.getString("description");
				Long price = rs.getLong("price");
				String category = rs.getString("category");
				String image_url = rs.getString("image_url");

				foods.add(new Product(id, restaurant_id, name, desctiption, price, category, image_url));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foods;

	}



	// add the function that retreives a restaurant specifically
}
