package oops;

public class Sphere extends Shape implements Iinterface{
	public Sphere( double H, double L, double W, double R) {
		super( H, L, W, R);
		// TODO Auto-generated constructor stub
	}
	
	public void areA() {
		 double Area = 4*(Math.PI)*r*r;
		 System.out.println("Interface ");
		 System.out.println("the Area  of Sphere is :"+Area);
	}
//	public void area() {
//		System.out.println("HI ");
//	}

}
