package oops;

public class C1 implements Iinterface {
	double r ;
	public C1(double radius) {
		this.r = radius;
	}
	public void areA() {
		double Area = (Math.PI)*r*r;
		 
		 System.out.println("the areA of C1 is :"+Area);
	}

}
