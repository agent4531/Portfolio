package module_1;

public class Circle {
	double radius;
	final double pi = 3.1415926;
	
	public Circle (double userR) {
		radius = userR;
	}
	public Circle () {
		radius  = 0;
	}
	public void setRadius(int newR) {
		radius = newR;
	}
	public double getRadius() {	
		return radius;
	}
	
	public double computeArea() {
		double area = 0;
		area = pi * Math.pow(radius, 2);
		
		return area;
	}
}
