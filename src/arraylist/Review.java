package arraylist;


public class Review {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Review(int id, String review) {
		super();
		this.id = id;
		this.review = review;
	}
	private String review;
	

}
