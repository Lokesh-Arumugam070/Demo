package arraylist;



public class Ratings {
	private int  id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public Ratings(int id, float ratings) {
		super();
		this.id = id;
		this.ratings = ratings;
	}
	private float ratings;
}
