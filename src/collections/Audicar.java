package collections;

import java.util.ArrayList;


public class Audicar implements Car {

	int serialno;
	String name;
	
	
	
	public Audicar(int serialNo, String name) {
		super();
		this.serialno = serialNo;
		this.name = name;
	}

	public void driving() {
		// TODO Auto-generated method stub
		System.out.println("Driving");
		
	}


	
	public static void main(String[] args) {
		
		Audicar altrozCar1 = new Audicar(1, "xdf");
		Audicar altrozCar2 = new Audicar(2, "oiu");

		
		ArrayList<Audicar> list = new ArrayList<Audicar>();
		list.add(altrozCar1);
		list.add(altrozCar2);
		for (int i = 0; i < list.size(); i++) {
			Audicar audi=list.get(i);
			System.out.println(audi.serialno+" "+audi.name);
			altrozCar1.driving();
		}
		
			
	}		
		}
		
	

