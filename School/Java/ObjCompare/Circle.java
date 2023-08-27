package module_1;

public class Circle extends Shapes {
	int radius;
	final double pi = 3.1415926;
	
	public Circle (int userR) {
		radius = userR;
	}
	public Circle () {
		radius  = 0;
	}
	public void setRadius(int newR) {
		radius = newR;
	}
	public int getRadius() {	
		return radius;
	}
	
	public int computeArea() {
		double area = 0;
		area = pi * Math.pow(radius, 2);
		int num = (int)Math.round(area);
		return num;
	}
	public String  toString() {
		return "Circle";
	}
}
