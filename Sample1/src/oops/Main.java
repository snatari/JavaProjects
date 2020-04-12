package oops;

public class Main implements Iinterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle C = new Circle(4.1,5.6,4.4,2);
		Shape S = new Shape(6.3,2.2,1.3,4.4);
		Sphere SP = new Sphere(2.7,1.1,1.1,2.2);
		Cylinder CL = new Cylinder(1.2,3.1,4.5,5.1);
		
		C1 circle1 = new C1(2.2);
		circle1.areA();//interface
		SP.areA();//interface
		S.area1();//extends
		C.setHeight(4);
		C.setLength(9);
		
		//extends from Shape class
		C.area();//extends
		S.area();//extends
		CL.area();//extends
		System.out.println("Height and Length of Circle is : "+C.getHeight()+C.getLength());
		System.out.println(C.getHeight()+C.getLength());
		Iinterface.areA();
	}

}
