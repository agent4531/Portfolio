package module_1;

public class Rectangle extends Shapes{
	int length, width;
	
	public Rectangle (int userL, int userW) {
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
	public int getLength() {	
		return length;
	}
	
	public void setWidth(int newW) {
		width = newW;
	}
	public int getWidth() {
		return width;
	}
	
	public int computeArea() {
		int area = 0;
		area = length * width;
		
		return area;
	}
	public String  toString() {
		return "Rectangle";
	}
}
