package oops;

public class Cylinder extends Shape implements Iinterface{
	 public Cylinder(double H,double L,double W ,double R) { 
	 super( H,L,W,R);
	 }
	public void area() {
		 double Area =((Math.PI)*r*Height) + 2*(Math.PI)*r*r;
		 
		 System.out.println("the Area of Cylinder is :"+Area);
	}

}
