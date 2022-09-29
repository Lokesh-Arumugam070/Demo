package arraylist;
import java.util.*;
public class Product {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Ratings> getRatings() {
		return ratings;
	}
	public void setRatings(List<Ratings> ratings) {
		this.ratings = ratings;
	}
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	public Product(int id, String name, List<Ratings> ratings, List<Review> review) {
		super();
		this.id = id;
		this.name = name;
		this.ratings = ratings;
		this.review = review;
	}
	private String name;
	List<Ratings>ratings;
	List<Review>review;
	

}
