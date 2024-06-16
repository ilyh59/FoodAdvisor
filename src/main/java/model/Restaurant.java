package model;

import java.util.List;


public class Restaurant {
	
	private int restaurant_id;
	private String name;
	private String address;
	private String phone_number;
	private String email;
	private String description;
	private  Long ratings;
	private int owner_id ;

	public int getId() {
		return restaurant_id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public String getEmail() {
		return email;
	}

	public String getDescription() {
		return description;
	}

	public void setId(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRatings(Long ratings) {
		this.ratings = ratings;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public Long getRatings() {
		return ratings;
	}

	public int getOwner_id() {
		return owner_id;
	}
}
