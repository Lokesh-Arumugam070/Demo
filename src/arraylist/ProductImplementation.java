package arraylist;
import java.util.*;
public class ProductImplementation {
	public static void main(String[] args) {
		Ratings ratings1=new Ratings(1,4.5f);
		Ratings ratings2=new Ratings(2,4.4f);
		Ratings ratings3=new Ratings(3,4.7f);
		Ratings ratings4=new Ratings(4,4.3f);
		
		List<Ratings>ratelist1=new ArrayList<Ratings>();
		ratelist1.add(ratings1);
		ratelist1.add(ratings2);
		ratelist1.add(ratings3);
		ratelist1.add(ratings4);
		
		Review review1=new Review(1,"Good");
		Review review2=new Review(2,"Good");
		Review review3=new Review(3,"Very Good");
		Review review4=new Review(4,"Good");
		
		List<Review>reviewlist1=new ArrayList<Review>();
		reviewlist1.add(review1);
		reviewlist1.add(review2);
		reviewlist1.add(review3);
		reviewlist1.add(review4);
		
		Product pro1=new Product(100,"Honor7c",ratelist1,reviewlist1);//1st product
		
		
		Ratings ratings5=new Ratings(1,4.5f);
		Ratings ratings6=new Ratings(2,4f);
		Ratings ratings7=new Ratings(3,4.8f);
		Ratings ratings8=new Ratings(4,3.9f);
		
		List<Ratings>ratelist2=new ArrayList<Ratings>();
		ratelist2.add(ratings5);
		ratelist2.add(ratings6);
		ratelist2.add(ratings7);
		ratelist2.add(ratings8);
		
		Review review5=new Review(1,"Good");
		Review review6=new Review(2,"Good");
		Review review7=new Review(3,"Excellent");
		Review review8=new Review(4,"Good");
		
		List<Review>reviewlist2=new ArrayList<Review>();
		reviewlist2.add(review5);
		reviewlist2.add(review6);
		reviewlist2.add(review7);
		reviewlist2.add(review8);
		
		Product pro2=new Product(40,"hp pavilion",ratelist2,reviewlist2);//2nd product
		
		List<Product>products=new ArrayList<Product>();
		products.add(pro1);
		products.add(pro2);
		List<Ratings>ratinglists=new ArrayList<>();
		ratinglists.addAll(ratelist1);
		ratinglists.addAll(ratelist2);
		
	    for (Product productdetails : products) {
	    	int productID=productdetails.getId();
	    	String name=productdetails.getName();
	    	List<Ratings>productrating=productdetails.getRatings();
	    	List<Review>productreview=productdetails.getReview();
	    	float totalrating=0;
	    	float totalreview=0;
	    	for(int i=0;i<productrating.size();i++)
	    	{
	    		Ratings r=productrating.get(i);
	    		totalrating =totalrating+r.getRatings();
	    		
			
		}totalreview=productreview.size();
	    	System.out.println("productID: "+productID+" product name: "+name+" Ratings: "+totalrating+" Review: "+totalreview);
		
	}	
}
}
 