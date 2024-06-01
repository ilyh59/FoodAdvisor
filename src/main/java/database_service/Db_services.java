package database_service;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.User;

public class Db_services {
	
	public static java.sql.Connection connect(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver O.K.");
			
			String url ="jdbc:mysql://localhost:3306/java";
			String user = "root";
			String passwd = "ismTHEyh123*";
		
			java.sql.Connection con = DriverManager.getConnection(url,user,passwd);
			System.out.println("Connexion effective !");
			
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static boolean insert_User(User user) {
		java.sql.Connection con = Db_services.connect();
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
	
	/* 
	public static ArrayList<Map<String, String>> get_jobs() throws SQLException {
		java.sql.Connection con = Db_services.connect();
		ArrayList<Map<String, String>> jobs_array = new ArrayList<Map<String, String>>();
		try {
			String sql = "SELECT * FROM jobs ORDER BY level";
			System.out.println(sql);
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> map = new HashMap<>();
				map.put("description", rs.getString("description"));
				map.put("label", rs.getString("label"));
				jobs_array.add(map);
			}
			return jobs_array;
		}catch(Exception e) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("the selection failed");
			return jobs_array;
		}
	}
	
	public static ArrayList<Map<String, String>> get_skills() throws SQLException {
		java.sql.Connection con = Db_services.connect();
		ArrayList<Map<String, String>> jobs_array = new ArrayList<Map<String, String>>();
		try {
			String sql = "SELECT * FROM jobskills ORDER BY valueSkill DESC ";
			//System.out.println(sql);
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> map = new HashMap<>();
				map.put("description", rs.getString("descSkill"));
				map.put("label", rs.getString("keySkill"));
				jobs_array.add(map);
			}
			return jobs_array;
		}catch(Exception e) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("the selection failed");
			return jobs_array;
		}
	}
	
	public static String get_desc(String job) throws SQLException {
		java.sql.Connection con = Db_services.connect();
		String desc = " ";
		try {
			String sql = "SELECT description FROM jobs WHERE label = '" + job + "'";
			System.out.println(sql);
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			
			while(rs.next()) {	
				desc = rs.getString("description");
			}
			return desc;
		}catch(Exception e) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("the selection failed");
			return desc;
		}
		
	} 
	*/
}
