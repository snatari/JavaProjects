package oops;

public class Shape {
//	 private double Height ;
//	private double length;
//	private double width;
//	private double r ;
	 double Height ;
	 double length;
	 double width;
	 double r ;
	public Shape() {
	}
	
	 public Shape(double H,double L,double W, double R) {
		 this.Height = H;
		 this.length = L;
		 this.width = W;
		 this.r = R;
	 }
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public void area() {
		 double Area = (Math.PI)*r*r;
		 
		 System.out.println("the Area is :"+Area);
	}
	public void area1() {
		double Area = (Math.PI)*r*Height;
		System.out.println("the area1 of Shape is: "+Area);
	}
}
