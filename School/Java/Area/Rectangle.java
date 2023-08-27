package module_1;

public class Rectangle {
	double length, width;
	
	public Rectangle (double userL, double userW) {
		length = userL;
		width = userW;
	}
	public Rectangle () {
		length = 0;
		width = 0;
	}
	public void setLength(int newL) {
		length = newL;
	}
	public double getLength() {	
		return length;
	}
	
	public void setWidth(int newW) {
		width = newW;
	}
	public double getWidth() {
		return width;
	}
	
	public double computeArea() {
		double area = 0;
		area = length * width;
		
		return area;
	}
}
