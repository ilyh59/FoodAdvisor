package model;

import java.util.List;


public class Resturant {
	
	private Long id;
	private String name;
	private List<Comment> comments;
	private List <Rate> ratings;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List <Rate> getRatings() {
		return ratings;
	}

	public void setRatings(List <Rate> ratings) {
		this.ratings = ratings;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
